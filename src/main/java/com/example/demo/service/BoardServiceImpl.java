package com.example.demo.service;

import com.example.demo.dao.BoardMapper;
import com.example.demo.domain.BoardVO;
import com.example.demo.domain.FileVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoardServiceImpl implements BoardService{
    //@Autowird를 사용하면 Bean이 자동으로 만들어진다.
    @Autowired
    private BoardMapper mBoardMapper;
    public List<BoardVO> boardListService(){

        return mBoardMapper.boardList();
    }

    @Override
    public BoardVO boardDetailService(int bno){

        return mBoardMapper.boardDetail(bno);
    }
    @Override
    public int boardInsertService(BoardVO board){

        return mBoardMapper.boardInsert(board);
    }
    @Override
    public int boardUpdateService(BoardVO board){

        return mBoardMapper.boardUpdate(board);
    }
    @Override
    public int boardDeleteService(int bno){

        return mBoardMapper.boardDelete(bno);
    }
    @Override
    //BoardService.java
    public int fileInsertService(FileVO file){
        return mBoardMapper.fileInsert(file);
    }
    @Override
    public FileVO fileDetailService(int bno){

        return mBoardMapper.fileDetail(bno);
    }

}

