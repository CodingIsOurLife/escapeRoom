package com.room.escape.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class RegisterRequest {

    @NotEmpty
    private String pw;

    @NotEmpty
    private String nickname;

    @NotEmpty
    private String email;

    protected RegisterRequest() {
    }

    public RegisterRequest(String pw, String nickname, String email) {
        this.pw = pw;
        this.nickname = nickname;
        this.email = email;
    }

}
