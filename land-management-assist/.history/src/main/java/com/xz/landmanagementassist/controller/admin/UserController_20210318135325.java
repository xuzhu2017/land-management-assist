package com.xz.landmanagementassist.controller.admin;

import javax.validation.Valid;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xz.landmanagementassist.controller.BaseController;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.query.UserQueryDTO;
import com.xz.landmanagementassist.domain.entity.admin.UserEntity;
import com.xz.landmanagementassist.service.admin.AdminUserRoleService;
import com.xz.landmanagementassist.service.admin.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * UserController
 * 
 * @author xuzhu
 * @date 2021-3-18 13:10:27
 */
public class UserController extends BaseController {
    @Autowired
    UserService userService;
    @Autowired
    AdminUserRoleService adminUserRoleService;

    @GetMapping("/api/admin/user")
    public Result<IPage<UserEntity>> listUsers() {
        return userService.selectUserList(new UserQueryDTO());
    }

    @PutMapping("/api/admin/user/status")
    public Result updateUserStatus(@RequestBody @Valid User requestUser) {
        userService.updateUserStatus(requestUser);
        return ResultFactory.buildSuccessResult("用户状态更新成功");
    }

    @PutMapping("/api/admin/user/password")
    public Result resetPassword(@RequestBody @Valid User requestUser) {
        userService.resetPassword(requestUser);
        return ResultFactory.buildSuccessResult("重置密码成功");
    }

    @PutMapping("/api/admin/user")
    public Result editUser(@RequestBody @Valid User requestUser) {
        userService.editUser(requestUser);
        return ResultFactory.buildSuccessResult("修改用户信息成功");
    }
}
