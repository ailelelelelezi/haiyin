package com.xule.haiyin.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class LoginController {
    @GetMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        return "/login/login.html";
    }

    @GetMapping("/login_out")
    public String login_out(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().removeAttribute("user");
        return "/login/login.html";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
        Object user1 = request.getSession().getAttribute("user");
        if(user1!=null){
            return "/login/index.html";
        }
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        if (user.equals("admin") && pwd.equals("admin")) {
            request.getSession().setAttribute("user", user);
            return "/login/index.html";
        }else if(user.equals("xule") && pwd.equals("123456")){
            request.getSession().setAttribute("user", user);
            return "/login/index.html";
        }
        else {
            model.addAttribute("msg","用户名或密码错误，请重新输入！");
            return "/login/login.html";
        }

    }

    @RequestMapping("/debug")
    public String debug(HttpServletRequest request, HttpServletResponse response) {

        return "/index/debug.html";
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

    @RequestMapping("/nav")
    public String nav(HttpServletRequest request, HttpServletResponse response) {

        return "/index/nav.html";
    }

    @RequestMapping("/progress")
    public String progress(HttpServletRequest request, HttpServletResponse response) {

        return "/index/progress.html";
    }

    @RequestMapping("/pane")
    public String pane(HttpServletRequest request, HttpServletResponse response) {
        return "/index/pane.html";
    }

    @RequestMapping("/badge")
    public String badge(HttpServletRequest request, HttpServletResponse response) {
        return "/index/badge.html";
    }

    @RequestMapping("/supply")
    public String supply(HttpServletRequest request, HttpServletResponse response) {
        return "/index/supply.html";
    }

    @RequestMapping("/page")
    public String page(HttpServletRequest request, HttpServletResponse response) {
        return "/element/page.html";
    }

    @RequestMapping("/datatable")
    public String datatable(HttpServletRequest request, HttpServletResponse response) {
        return "/element/datatable.html";
    }

    @RequestMapping("/alert")
    public String alert(HttpServletRequest request, HttpServletResponse response) {
        return "/element/alert.html";
    }

    @RequestMapping("/datetime")
    public String datetime(HttpServletRequest request, HttpServletResponse response) {
        return "/element/datetime.html";
    }

    @RequestMapping("/tree")
    public String tree(HttpServletRequest request, HttpServletResponse response) {
        return "/element/tree.html";
    }

    @RequestMapping("/round")
    public String round(HttpServletRequest request, HttpServletResponse response) {
        return "/element/round.html";
    }

    @RequestMapping("/color")
    public String color(HttpServletRequest request, HttpServletResponse response) {
        return "/element/color.html";
    }

    @RequestMapping("/shuttle")
    public String shuttle(HttpServletRequest request, HttpServletResponse response) {
        return "/element/shuttle.html";
    }

    @RequestMapping("/score")
    public String score(HttpServletRequest request, HttpServletResponse response) {
        return "/element/score.html";
    }
}
