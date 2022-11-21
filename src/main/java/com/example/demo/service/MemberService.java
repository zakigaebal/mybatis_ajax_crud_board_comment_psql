package com.example.demo.service;

import com.example.demo.dao.MemberMapper;
import com.example.demo.domain.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberDao;

    /* 멤버 리스트 */
    public List<MemberVO> doMemberList(){

        List<MemberVO> list = new ArrayList<>();
        list = memberDao.doMemberList();
        return  list;
    }

    /* One Row Select */
    public MemberVO doMemberListOne(String strMemberId){
        MemberVO vo_member = memberDao.doMemberListOne(strMemberId);
        return  vo_member;
    }

    /* 멤버 수정 */
    public int doMemberUp(MemberVO vo_member){

        int intI = memberDao.doMemberUp(vo_member);

        return  intI;
    }

    /* 공부기록 삭제 */
    public int doMemberDel(String strMemberId){

        int intI  = memberDao.doMemberDel(strMemberId);
        return  intI;
    }

    /* 공부하기 등록 */
    public int doMemberIns(MemberVO vo_member){

        int intI = memberDao.doMemberIns(vo_member);

        return  intI;
    };

    public MemberVO doMemberLogin(String strLoginId) {

        MemberVO vo_member = memberDao.doMemberLogin(strLoginId);

        return vo_member;

    }


}
