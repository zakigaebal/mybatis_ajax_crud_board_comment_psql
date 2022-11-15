package com.example.demo.service;

import com.example.demo.dao.TestMapper;
import com.example.demo.domain.BoardVO;
import com.example.demo.domain.FileVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestService {
    @Autowired
    private TestMapper mBoardMapper;
    public List<BoardVO> boardListService() throws Exception{

        return mBoardMapper.boardList();
    }

    public BoardVO boardDetailService(int bno) throws Exception{

        return mBoardMapper.boardDetail(bno);
    }

    public int boardInsertService(BoardVO board) throws Exception{

        return mBoardMapper.boardInsert(board);
    }

    public int boardUpdateService(BoardVO board) throws Exception{

        return mBoardMapper.boardUpdate(board);
    }

    public int boardDeleteService(int bno) throws Exception{

        return mBoardMapper.boardDelete(bno);
    }

    //BoardService.java
    public int fileInsertService(FileVO file) throws Exception{
        return mBoardMapper.fileInsert(file);
    }

    public FileVO fileDetailService(int bno) throws Exception{

        return mBoardMapper.fileDetail(bno);
    }

}

