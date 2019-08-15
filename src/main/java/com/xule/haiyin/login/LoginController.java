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

    @RequestMapping("/container")
    public String colrow(HttpServletRequest request, HttpServletResponse response) {

        return "/index/container.html";
    }
    @RequestMapping("/button")
    public String button(HttpServletRequest request, HttpServletResponse response) {

        return "/index/button.html";
    }
    @RequestMapping("/tab")
    public String tab(HttpServletRequest request, HttpServletResponse response) {

        return "/index/tab.html";
    }
    @RequestMapping("/time")
    public String time(HttpServletRequest request, HttpServletResponse response) {

        return "/index/time.html";
    }
}
