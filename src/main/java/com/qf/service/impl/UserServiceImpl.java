package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.UserMapper;
import com.qf.pojo.User;
import com.qf.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserMapper userMapper;

    // 发送邮件
    @Autowired
    JavaMailSender javaMailSender;

    // 配置文件获取发件人
    @Value("${spring.mail.username}")
    private String from;
    
    @Override
    public BaseResp login(User user, HttpServletRequest request) {

        BaseResp baseResp = new BaseResp();
        if (user != null) {
            if (user.getUserTel() != null && !StringUtils.isEmpty(user.getUserTel())) {
                // 从数据库查找该用户
                User byUserTel = userMapper.findByUserTel(user.getUserTel());
                System.out.println(byUserTel.toString());
                if (byUserTel != null) {
                    if (byUserTel.getPassWord().equals(user.getPassWord())) {

                        baseResp.setMessage("登录成功");
                        baseResp.setCode(200);

                        // 用户信息存储session中
                        HttpSession session = request.getSession();
                        session.setAttribute("user",byUserTel);
                        return baseResp;
                    }
                } else {
                    baseResp.setMessage("用户不存在");
                }
            } else {
                baseResp.setMessage("用户名不能为空");
            }
        } else {
            baseResp.setMessage("请输入正确的用户信息");
        }
        return baseResp;
    }

    @Override
    public void sendEmail(String email,HttpServletRequest request) {

        if (email != null) {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

            simpleMailMessage.setFrom(from);
            simpleMailMessage.setSubject("云闪付注册验证码，一分钟内注册有效");

            Random random = new Random();
            String code = "";
            for (int i=0; i < 4; i++) {
                int s = random.nextInt(10);
                code += s;
            }
            simpleMailMessage.setText(code);
            simpleMailMessage.setTo(email);

            // 发送
            javaMailSender.send(simpleMailMessage);
            // 验证码存入session
            HttpSession session = request.getSession();
            session.setAttribute(email, code);
        }
    }

    @Override
    public BaseResp registy(User user,HttpServletRequest request) {

        BaseResp baseResp = new BaseResp();
        if (user != null) {
            // 判断验证码是否正确
            HttpSession session = request.getSession();
            String code = (String) session.getAttribute(user.getEmail());

            if (user.getCodes().equals(code)) {
                // 判断该用户是否已经注册
                User byUserTel = userMapper.findByUserTel(user.getUserTel());
                if (byUserTel == null) {
                    userMapper.saveAndFlush(user);
                    baseResp.setCode(200);
                    baseResp.setMessage("注册成功！");
                } else {
                    baseResp.setCode(201);
                    baseResp.setMessage("注册失败！");
                }
            } else {
                baseResp.setCode(202);
                baseResp.setMessage("验证码输入有误");
            }
        } else {
            baseResp.setCode(203);
            baseResp.setMessage("注册信息为空，注册失败！");
        }
        return baseResp;
    }

    @Override
    public BaseResp logOut(HttpServletRequest request) {

        BaseResp baseResp = new BaseResp();
        HttpSession session = request.getSession();
        session.invalidate();
        baseResp.setCode(200);
        baseResp.setMessage("注销用户成功");
        return baseResp;
    }
}
