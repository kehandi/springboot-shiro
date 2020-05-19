package com.khd.springbootshiro.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.khd.springbootshiro.bean.ShiroUser;
import com.khd.springbootshiro.mapper.ShiroUserMapper;
import com.khd.springbootshiro.util.JSONResultUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("shiro")
public class ShiroLoginController {

    @Autowired
    private ShiroUserMapper shiroUserMapper;

    @RequestMapping("doLogin")
    @ResponseBody
    public JSONResultUtil<String> doLogin(String username, String password, HttpServletRequest request) {
        ShiroUser user = shiroUserMapper.findByUsernameAndPassword(username, password);
        if (user == null) {
            return new JSONResultUtil<>(false, "账号或者密码错误");
        }

        // shiro中进行登录
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        currentUser.login(token);

        // 设置登录的user
        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        return new JSONResultUtil<>(true, "ok");
    }
}