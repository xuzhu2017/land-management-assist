package com.xz.landmanagementassist.controller.admin;

import javax.validation.Valid;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xz.landmanagementassist.controller.BaseController;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.query.UserQueryDTO;
import com.xz.landmanagementassist.domain.entity.admin.UserEntity;
import com.xz.landmanagementassist.exception.ErrorInfoEnum;
import com.xz.landmanagementassist.service.admin.AdminUserRoleService;
import com.xz.landmanagementassist.service.admin.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
        return Result.success(userService.selectUserList(new UserQueryDTO()));
    }

    @DeleteMapping("/api/admin/user")
    public Result<Boolean> updateUserStatus(@RequestBody @Valid UserDTO requestUser) {
        return Result.success(userService.update(requestUser), ErrorInfoEnum.UPDATE_SUCCESS);
    }

    @PutMapping("/api/admin/user/password")
    public Result<UserDTO> resetPassword(@RequestBody @Valid UserDTO requestUser) {
        return Result.success(userService.resetPassword(requestUser));
    }

    @PutMapping("/api/admin/user")
    public Result<UserDTO> editUser(@RequestBody @Valid UserDTO requestUser) {
        return Result.success(userService.resetPassword(requestUser), ErrorInfoEnum.UPDATE_SUCCESS);
    }
}
