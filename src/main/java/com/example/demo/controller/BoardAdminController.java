package com.example.demo.controller;

import com.example.demo.service.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardAdminController {

    @Autowired
    BoardServiceImpl mBoardService;

    @RequestMapping("/admin22") //게시판 리스트 화면 호출
    private String boardAdmin(Model model){
        model.addAttribute("list", mBoardService.boardListService());
        return "boardAdmin/adminList"; //생성할 jsp
    }

    @RequestMapping("/admin/test") //게시판 리스트 화면 호출
    private String boardAdmin2(Model model){
        model.addAttribute("list", mBoardService.boardListService());
        return "boardAdmin/adminList"; //생성할 jsp
    }
}
