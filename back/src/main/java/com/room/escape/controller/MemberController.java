package com.room.escape.controller;

import com.room.escape.dto.request.RegisterRequest;
import com.room.escape.dto.response.RegisterResponse;
import com.room.escape.entity.Member;
import com.room.escape.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody RegisterRequest registerRequest, BindingResult bindingResult, HttpServletRequest request){
        log.info("request come");
        if(bindingResult.hasErrors()){
            log.info("errors = {}", bindingResult);
            return new ResponseEntity<>(bindingResult, HttpStatus.BAD_REQUEST);
        }
        Member member = new Member(registerRequest.getPw(), registerRequest.getNickname(), registerRequest.getEmail());
        memberService.register(member);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create(request.getRequestURI() + "/" + registerRequest.getNickname()));

        return new ResponseEntity<>(headers, HttpStatus.FOUND);
    }

    @GetMapping("/register/{nickname}")
    public ResponseEntity<Object> registerEnd(@PathVariable String nickname){
        RegisterResponse registerResponse = new RegisterResponse(nickname);
        log.info("registered");
        return new ResponseEntity<>(registerResponse, HttpStatus.OK);
    }

}
