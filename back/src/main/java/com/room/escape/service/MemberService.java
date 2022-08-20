package com.room.escape.service;

import com.room.escape.entity.Member;
import com.room.escape.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void register(Member member){
        memberRepository.save(member);
    }
}
