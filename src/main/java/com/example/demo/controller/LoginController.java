package com.example.demo.controller;

import com.example.demo.domain.MemberVO;
import com.example.demo.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    MemberServiceImpl memberService;

    //로그인페이지이동
    @GetMapping("/login")
    public String doLogin()
    {
        System.out.println("로그인페이지로 이동합니다.");
        return "/login/loginForm";

    }

    /* 로그인 하는 부분 */
    @PostMapping("/login_exe")
    public String doLoginExe(@RequestParam(value="loginId", defaultValue = "--") String strLoginId,
                             @RequestParam(value="password", defaultValue = "--") String strPassword,
                             Model model,
                             HttpServletRequest request){

        String strReturn="";
        String strMessage="";
        boolean bl_login = false;

        MemberVO vo_member = memberService.doMemberLogin(strLoginId);

        if(vo_member==null){
            strReturn = "/login/loginForm";
            strMessage = "ID가 존재하지 않아요.";
        }
        else{
            if(!strPassword.equals(vo_member.getPassword())) {
                strReturn = "/login/loginForm";
                strMessage = "패스워드가 일치하지 않아요.";
            }else{
                bl_login = true;
                strReturn = "redirect:/";
                strMessage = "login 성공";
            }

        }

        model.addAttribute("message", strMessage);

        HttpSession session = request.getSession();
        if(bl_login == true){
            session.setAttribute("ss_member_id", vo_member.getMemberId());
            session.setAttribute("ss_login_id", vo_member.getLoginId());
            session.setAttribute("ss_name", vo_member.getName());
            session.setAttribute("ss_role", vo_member.getRole());
        }

        //System.out.println(vo_member.getName());
        return strReturn;
    }

    @GetMapping("/logout")
    public String doLogout(HttpServletRequest request){

        HttpSession session = request.getSession(false);
        session.invalidate();

        return "redirect:/";
    }
}
