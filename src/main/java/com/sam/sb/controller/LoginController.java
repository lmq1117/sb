package com.sam.sb.controller;

import cn.hutool.core.lang.Console;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @PostMapping("/toMain")
    public String toMain(){
        Console.log("登录成功执行跳转");
        return "redirect:main.html";
    }

    @PostMapping("/toError")
    public String toError(){
        Console.log("登录失败执行跳转");
        return "redirect:error.html";
    }

}
