package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    // 登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BaseResp login(@RequestBody User user, HttpServletRequest request) {

        return userService.login(user,request);
    }

    // 发送邮件
    @RequestMapping(value = "/sendEmail/{email}",method = RequestMethod.GET)
    public void sendEmail(@PathVariable String email, HttpServletRequest request) {

        userService.sendEmail(email, request);
    }

    // 注册
    @RequestMapping(value = "/registy", method = RequestMethod.POST)
    public BaseResp registy(@RequestBody User user, HttpServletRequest request) {

        return userService.registy(user, request);
    }

    // 退出登录
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public void logOut(HttpServletRequest request) {

        userService.logOut(request);
    }
}
