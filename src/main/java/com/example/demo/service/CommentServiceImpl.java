package com.example.demo.service;

import com.example.demo.dao.CommentMapper;
import com.example.demo.domain.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentMapper mCommentMapper;

    @Override
    public List<CommentVO> commentListService(int bno){

        return mCommentMapper.commentList(bno);
    }

    @Override
    public List<CommentVO> commentDeleteListService(int cno){
        return mCommentMapper.commentDeleteList(cno);
    }

    public int commentInsertService(CommentVO comment){

        return mCommentMapper.commentInsert(comment);
    }

    public int commentUpdateService(CommentVO comment){

        return mCommentMapper.commentUpdate(comment);
    }

    public int commentDeleteService(int cno){

        return mCommentMapper.commentDelete(cno);
    }
}



