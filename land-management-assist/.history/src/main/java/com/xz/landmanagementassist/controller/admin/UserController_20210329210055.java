package com.xz.landmanagementassist.controller.admin;

import javax.validation.Valid;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xz.landmanagementassist.domain.common.PageParam;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.query.UserQueryDTO;
import com.xz.landmanagementassist.domain.entity.admin.UserEntity;
import com.xz.landmanagementassist.exception.ErrorInfoEnum;
import com.xz.landmanagementassist.service.admin.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 * 
 * @author xuzhu
 * @date 2021-3-18 13:10:27
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/api/admin/user/pagedList")
    public Result<IPage<UserEntity>> pagedList() {
        return Result.success(userService.selectUserList(new UserQueryDTO(new PageParam(0, 200))));
    }

    @PutMapping("/api/admin/user/resetPassword")
    public Result<UserDTO> resetPassword(@RequestBody @Valid UserDTO requestUser) {
        return Result.success(userService.resetPassword(requestUser));
    }

    @PutMapping("/api/admin/user")
    public Result<Boolean> update(@RequestBody @Valid UserDTO requestUser) {
        return Result.success(userService.update(requestUser), ErrorInfoEnum.UPDATE_SUCCESS);
    }

    @DeleteMapping("/api/admin/user")
    public Result<Boolean> delete(@RequestBody @Valid UserDTO requestUser) {
        return Result.success(userService.delete(requestUser), ErrorInfoEnum.DELETE_SUCCESS);
    }

}
