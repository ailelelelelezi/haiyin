package com.xule.haiyin.index;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@RestController
@RequestMapping("/data")
public class IndexController {
    @RequestMapping("/table")
    public String table(HttpServletRequest request, HttpServletResponse response) {
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
        String path = this.getClass().getResource("/").getPath();
        path += "static/json/table.json";
        InputStream in = null;
        StringBuffer sb = new StringBuffer();

        try {
            in = new FileInputStream(path);
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = (in.read(bytes))) != -1) {
                sb.append(new String(bytes, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
