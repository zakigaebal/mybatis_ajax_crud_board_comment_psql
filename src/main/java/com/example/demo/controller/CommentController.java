package com.example.demo.controller;

import com.example.demo.domain.CommentVO;
import com.example.demo.service.CommentServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"댓글정보를 제공하는 Controller"})
@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentServiceImpl mCommentService;

    @RequestMapping("/list") // comment list
    @ResponseBody
    private List<CommentVO> mcommentServiceList(int bno) throws Exception {
        return mCommentService.commentListService(bno);
    }

    @RequestMapping("/deleteList") // comment list
    @ResponseBody
    private List<CommentVO> mcommentDeleteServiceList(int cno) throws Exception {
        return mCommentService.commentDeleteListService(cno);
    }


    @PostMapping("/cinsert")
    public String writeReply(
            @RequestParam int bno, @RequestParam("replyIdx")int replyIdx,  @RequestParam("content")String content, @RequestParam String writer ) throws Exception {
            CommentVO comment= new CommentVO();
            comment.setBno(bno);
            comment.setContent(content);
            comment.setReplyIdx(replyIdx);
            comment.setWriter(writer);
            mCommentService.commentInsertService(comment);
        return "redirect:/detail/" + bno;
    }


    @RequestMapping("/update") //댓글 수정
    @ResponseBody
    private int mCommentServiceUpdateProc(@RequestParam int cno, @RequestParam String content) throws Exception{

        CommentVO comment = new CommentVO();
        comment.setCno(cno);
        comment.setContent(content);

        return mCommentService.commentUpdateService(comment);
    }
    @RequestMapping("/delete/{cno}") //댓글 삭제
    @ResponseBody
    private int mCommentServiceDelete(@PathVariable int cno) throws Exception{
        return mCommentService.commentDeleteService(cno);
    }

}


