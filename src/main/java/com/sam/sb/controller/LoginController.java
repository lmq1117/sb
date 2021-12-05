package com.sam.sb.controller;

import cn.hutool.core.lang.Console;
import com.sam.sb.dao.entity.Users;
import com.sam.sb.dao.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {


    @Autowired
    UsersService usersService;

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


    @GetMapping("/m/user")
    @ResponseBody
    public Users getUsersTest(@RequestParam Long id){
        Console.log("#id");
        Console.log(id);
        return usersService.selectUsersById(id);
    }

}
