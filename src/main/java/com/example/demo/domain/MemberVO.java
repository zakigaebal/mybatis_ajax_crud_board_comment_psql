package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class MemberVO {

    private int memberId;
    private String loginId;
    private String password;
    private String name;
    private String role;

    private String phone;

    private String gender;

    private String regDay;

    @Builder
    public MemberVO(int memberId, String loginId, String password, String name, String role, String phone, String gender, String regDay) {
        this.memberId = memberId;
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.role = role;
        this.phone = phone;
        this.gender = gender;
        this.regDay = regDay;
    }
}
