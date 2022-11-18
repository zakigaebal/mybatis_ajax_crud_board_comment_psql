package com.example.demo.service;

import com.example.demo.dao.BoardMapper;
import com.example.demo.domain.BoardVO;
import com.example.demo.domain.FileVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BoardService {


    public List<BoardVO> boardListService();

    public BoardVO boardDetailService(int bno);

    public int boardInsertService(BoardVO board);

    public int boardUpdateService(BoardVO board);

    public int boardDeleteService(int bno);

    //BoardService.java
    public int fileInsertService(FileVO file);

    public FileVO fileDetailService(int bno);

}
