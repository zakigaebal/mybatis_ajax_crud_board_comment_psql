package com.example.demo.controller;

import com.example.demo.domain.MemberVO;
import com.example.demo.service.MemberServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberServiceImpl memberService;

    @GetMapping("/list")
    public String doMemberList(Model model){

        List<MemberVO> list = new ArrayList<>();
        list = memberService.doMemberList();

        model.addAttribute("list", list);



        return  "/member/member_list";
    }

    @GetMapping("/insert")
    public String doIns(){
        System.out.println("회원가입페이지로 이동합니다.");
        return "member/join";
    }

    /* 등록하기 실행  */
    @PostMapping("/insert_exe")
    public String doInsExe(@ModelAttribute MemberVO vo_member,  RedirectAttributes ra){
try{
    System.out.println("asds");
    int intI = memberService.doMemberIns(vo_member);

    System.out.println(intI);
    System.out.println("회원가입을 진행합니다.");
    return "redirect:/member/list";
}catch (RuntimeException re){
    System.out.println(2);
    ra.addFlashAttribute("msg", "중복아이디존재");
//    ra.addFlashAttribute("url","/member/insert");
    return "redirect:/member/insert"; // alert 후, 전달된 url 파라미터로 이동시키는 페이지




}catch (Exception e){
    System.out.println(3);
    return "redirect:/member/insert";
}




    }


    /* 수정 - 클릭 */
    @GetMapping("/modify")
    public String doMod(HttpServletRequest request){
        String strMemberId = request.getParameter("member_id");

        MemberVO vo_member = memberService.doMemberListOne(strMemberId);

        request.setAttribute("vo_member", vo_member);

        return "/member/member_mod";
    }

    /* 수정 - 처리  */
    @PostMapping("/modify_exe")
    public String doModExe(@ModelAttribute MemberVO vo_member){

        int intI = memberService.doMemberUp(vo_member);

        return "redirect:/home/member_reg";
    }
    /* 삭제 */
    @GetMapping("/delete")
    public String doDel(@RequestParam(value="member_id", defaultValue = "--") int MemberId){
        int intI = memberService.doMemberDel(MemberId);
        log.info("intI => "+intI);
        return "redirect:/member/list";
    }

//    @RequestMapping("/delete/{bno}")
//    private String boardDelete(@PathVariable int bno){
//
//        mBoardService.boardDeleteService(bno);
//
//        return "redirect:/list";
//    }

}
