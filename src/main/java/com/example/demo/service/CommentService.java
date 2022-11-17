package com.example.demo.service;

import com.example.demo.dao.CommentMapper;
import com.example.demo.dao.TestMapper;
import com.example.demo.domain.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentMapper mCommentMapper;


    public List<CommentVO> commentListService(int bno) throws Exception{

        return mCommentMapper.commentList(bno);
    }

    public List<CommentVO> commentDeleteListService(int cno) throws Exception{
        return mCommentMapper.commentDeleteList(cno);
    }

    public int commentInsertService(CommentVO comment) throws Exception{

        return mCommentMapper.commentInsert(comment);
    }

    public int commentUpdateService(CommentVO comment) throws Exception{

        return mCommentMapper.commentUpdate(comment);
    }

    public int commentDeleteService(int cno) throws Exception{

        return mCommentMapper.commentDelete(cno);
    }
}

