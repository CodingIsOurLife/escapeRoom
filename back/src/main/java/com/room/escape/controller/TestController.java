package com.room.escape.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @RequestMapping("/api")
    public String con(){
        log.info("success~~~~");
        return "success!!!";
    }
}
