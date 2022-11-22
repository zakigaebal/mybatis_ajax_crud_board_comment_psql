package com.example.demo.service;

import com.example.demo.domain.MemberVO;

import java.util.ArrayList;
import java.util.List;

public interface MemberService {

    public List<MemberVO> doMemberList();

    /* One Row Select */
    public MemberVO doMemberListOne(String strMemberId);

    /* 멤버 수정 */
    public int doMemberUp(MemberVO vo_member);

    /* 멤버 삭제 */
    public int doMemberDel(int MemberId);

    /* 멤버 등록 */
    public int doMemberIns(MemberVO vo_member);

    public MemberVO doMemberLogin(String strLoginId);

}
