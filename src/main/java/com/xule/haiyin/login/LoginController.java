package com.xule.haiyin.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "/login/login.html";
    }
    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response){
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        return "/login/index.html";
    }
    @RequestMapping("/main")
    public String main(HttpServletRequest request, HttpServletResponse response){
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        return "/index/index.html";
    }
}
