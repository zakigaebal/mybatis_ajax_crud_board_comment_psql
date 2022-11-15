package com.example.demo.controller;


import com.example.demo.domain.Board;
import com.example.demo.domain.Reply;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;


@Controller
public class BoardController {

    @Autowired
    private BoardService s;

    @GetMapping("/home")
    public String index() {
        return "index";
    }

    @GetMapping("/tables")
    public String hello() {
        return "tables";
    }

    @GetMapping("/3")
    public ModelAndView jsptest(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","jsp파일");
        mv.setViewName("index2");
        return mv;
    }

    @GetMapping("/board")
    public String root() {
        return "board";
    }

    @GetMapping("/write")
    public String write() {
        return "write";
    }

    @GetMapping("/view")
    public String view() {
        return "view";
    }



    @PostMapping("/writeAction")
    public String writeAction(
            @RequestParam("title")String title,
            @RequestParam("contents")String contents) throws IllegalStateException, IOException {
        s.addBoard(new Board(0, title, contents
                , null
        ));
        return "tables";
    }

    @GetMapping("/boardList")
    @ResponseBody
    public List<Board> boardList(){
        return s.getBoard();
    }
    @GetMapping("/boardView")
    @ResponseBody
    public Board boardList(@RequestParam("idx")int idx){
        return s.getBoardOne(idx);
    }


    //    게시글 삭제

//    public String deleteMembe2r(@PathVariable int idx){
//        s.deleteMember(idx);
//        return "tables";
//    }


    @GetMapping("/replyList")
    @ResponseBody
    public List<Reply> replyList(@RequestParam("idx")int boardIdx){
        return s.getReply(boardIdx);
    }

    @PostMapping("/writeReply")
    public String writeReply(
            @RequestParam("idx")int idx,
            @RequestParam("replyIdx")int replyIdx,
            @RequestParam("contents")String contents) {
        s.addReply(new Reply(0, idx,replyIdx, contents));
        return "redirect:view?idx=" + idx;
    }

    @DeleteMapping("/board/del/{idx}")
    public String deleteMember(@PathVariable int idx){
            s.deleteMember(idx);
            return "redirect:tables";
    }

    



}
