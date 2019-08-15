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
    public String login() {
        return "/login/login.html";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        return "/login/index.html";
    }

    @RequestMapping("/form")
    public String main(HttpServletRequest request, HttpServletResponse response) {

        return "/index/form.html";
    }

    @RequestMapping("/table")
    public String table(HttpServletRequest request, HttpServletResponse response) {

        return "/index/table.html";
    }

    @RequestMapping("/colrow")
    public String colrow(HttpServletRequest request, HttpServletResponse response) {

        return "/index/colrow.html";
    }
}
