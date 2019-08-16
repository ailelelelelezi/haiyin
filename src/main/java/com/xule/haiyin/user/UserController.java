package com.xule.haiyin.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/edit")
    public String login_out(HttpServletRequest request, HttpServletResponse response) {
        return "/index/user_edit.html";
    }
}
