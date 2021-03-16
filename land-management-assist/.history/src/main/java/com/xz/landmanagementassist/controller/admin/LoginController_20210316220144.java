package com.xz.landmanagementassist.controller.admin;

import com.xz.landmanagementassist.controller.BaseController;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.service.admin.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    public Result<Boolean> register(@RequestBody UserDTO user) {
        return userService.register(user);
    }

    @GetMapping("/api/logout")
    public Result<Void> logout() {
        return userService.logout();
    }

    @GetMapping("/api/authentication")
    public Result<Boolean> authentication() {
        return userService.authentication();
    }
}
