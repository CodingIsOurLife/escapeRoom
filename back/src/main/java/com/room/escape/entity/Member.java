package com.room.escape.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String pw;

    private String nickname;

    private String email;

    private Integer point;

    private Integer grade;

    @Column(name = "member_date")
    private LocalDateTime date;

    protected Member() {
    }

    public Member(String pw, String nickname, String email) {
        this.pw = pw;
        this.nickname = nickname;
        this.email = email;
        this.point = 0;
        this.grade = 0;
        this.date = LocalDateTime.now();
    }
}
