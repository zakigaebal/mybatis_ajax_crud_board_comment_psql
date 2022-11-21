package com.example.demo.dao;

import com.example.demo.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    //멤버 전체 리스트
    public List<MemberVO> doMemberList();

    //멤버 One row
    public MemberVO doMemberListOne(String strKeyId);

    //멤버 수정
    public int doMemberUp(MemberVO vo_member);

    //멤버 삭제
    public int doMemberDel(String id);

    //멤버 등록
    public int doMemberIns(MemberVO vo);

    // 로그인
    MemberVO doMemberLogin(String strLoginId);
}
