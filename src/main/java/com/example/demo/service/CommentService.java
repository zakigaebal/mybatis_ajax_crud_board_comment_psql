package com.example.demo.service;

import com.example.demo.domain.CommentVO;

import java.util.List;

public interface CommentService {
    public List<CommentVO> commentListService(int bno);

    public List<CommentVO> commentDeleteListService(int cno);

    public int commentInsertService(CommentVO comment);

    public int commentUpdateService(CommentVO comment);

    public int commentDeleteService(int cno);
}
