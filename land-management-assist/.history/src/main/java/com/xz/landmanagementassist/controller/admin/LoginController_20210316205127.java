package com.xz.landmanagementassist.controller.admin;

import com.xz.landmanagementassist.controller.BaseController;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.service.admin.UserService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.HtmlUtils;

/**
 * LoginController
 * 
 * @author xuzhu
 * @date 2021-3-15 22:07:49
 */
public class LoginController extends BaseController {
    @Autowired
    UserService userService;

    @PostMapping("/api/login")
    public Result<UserDTO> login(@RequestBody UserDTO requestUser) {
        return userService.login(requestUser);
    }

    @PostMapping("/api/register")
    public Result register(@RequestBody User user) {
        int status = userService.register(user);
        switch (status) {
        case 0:
            return ResultFactory.buildFailResult("用户名和密码不能为空");
        case 1:
            return ResultFactory.buildSuccessResult("注册成功");
        case 2:
            return ResultFactory.buildFailResult("用户已存在");
        }
        return ResultFactory.buildFailResult("未知错误");
    }

    @GetMapping("/api/logout")
    public Result logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return ResultFactory.buildSuccessResult("成功登出");
    }

    @GetMapping("/api/authentication")
    public String authentication() {
        return "身份认证成功";
    }
}
