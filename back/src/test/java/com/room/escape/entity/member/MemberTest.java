package com.room.escape.entity.member;

import com.room.escape.entity.Member;
import com.room.escape.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
class MemberTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void saveTest(){
        Member member = new Member("password", "nickname", "email@abc.com");
        Member newMember = memberRepository.save(member);

        Assertions.assertThat(newMember.getPw()).isEqualTo(member.getPw());
        Assertions.assertThat(newMember).isEqualTo(member);
    }

}