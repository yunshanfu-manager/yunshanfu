package com.qf.service;

import com.qf.common.BaseResp;
import com.qf.pojo.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    BaseResp login(User user, HttpServletRequest request);

    void sendEmail(String email, HttpServletRequest request);

    BaseResp registy(User user, HttpServletRequest request);

    BaseResp logOut(HttpServletRequest request);
}
