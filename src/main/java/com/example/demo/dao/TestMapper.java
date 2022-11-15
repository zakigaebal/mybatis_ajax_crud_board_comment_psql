package com.example.demo.dao;

import com.example.demo.domain.BoardVO;
import com.example.demo.domain.FileVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TestMapper {
    //게시글 개수
    public int boardCount() throws Exception;

    //게시글 목록
    public List<BoardVO> boardList() throws Exception;

    //게시글 상세
    public BoardVO boardDetail(int bno) throws Exception;

    //게시글 작성
    public int boardInsert(BoardVO board) throws Exception;

    //게시글 수정
    public int boardUpdate(BoardVO board) throws Exception;

    //게시글 삭제
    public int boardDelete(int bno) throws Exception;

    // BoardMapper.java
    public int fileInsert(FileVO file) throws Exception;

    //파일 상세
    public FileVO fileDetail(int bno) throws Exception;




}
