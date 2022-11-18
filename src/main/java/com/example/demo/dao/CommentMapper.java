package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.example.demo.domain.CommentVO;

@Mapper
public interface CommentMapper {
    // 댓글 개수
    public int commentCount() throws Exception;

    // 댓글 목록
    public List<CommentVO> commentList(int bno);

    public List<CommentVO> commentDeleteList(int cno);

    // 댓글 작성
    public int commentInsert(CommentVO comment);

    // 댓글 수정
    public int commentUpdate(CommentVO comment);

    // 댓글 삭제
    public int commentDelete(int cno);

}


