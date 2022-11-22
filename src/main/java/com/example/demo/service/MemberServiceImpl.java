package com.example.demo.service;

import com.example.demo.dao.MemberMapper;
import com.example.demo.domain.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberMapper memberDao;


    /* 멤버 리스트 */
    @Override
    public List<MemberVO> doMemberList(){

        List<MemberVO> list = new ArrayList<>();
        list = memberDao.doMemberList();
        return  list;
    }

    /* One Row Select */
    @Override
    public MemberVO doMemberListOne(String strMemberId){
        MemberVO vo_member = memberDao.doMemberListOne(strMemberId);
        return  vo_member;
    }

    /* 멤버 수정 */
    @Override
    public int doMemberUp(MemberVO vo_member){
        int intI = memberDao.doMemberUp(vo_member);
        return  intI;
    }

    /* 멤버 삭제 */
    @Override
    public int doMemberDel(int MemberId){

        int intI  = memberDao.doMemberDel(MemberId);
        return  intI;
    }

    /* 멤버 등록 */
    @Override
    public int doMemberIns(MemberVO vo_member){

        int intI = memberDao.doMemberIns(vo_member);

        return  intI;
    };
    @Override
    public MemberVO doMemberLogin(String strLoginId) {

        MemberVO vo_member = memberDao.doMemberLogin(strLoginId);

        return vo_member;

    }


}
