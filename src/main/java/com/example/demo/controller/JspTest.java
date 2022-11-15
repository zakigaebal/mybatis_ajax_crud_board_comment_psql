package com.example.demo.controller;

import com.example.demo.dao.BoardMapper;
import com.example.demo.dao.TestMapper;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class JspTest {
    @Autowired
    TestMapper mBoardMapper;

    @RequestMapping("/jsp")
    private String jspTest() throws Exception{

            System.out.println(mBoardMapper.boardCount()); // <<<<TEST

            return "test";

    }
}
