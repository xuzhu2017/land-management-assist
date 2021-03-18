package com.xz.landmanagementassist.controller.admin;

import java.util.List;

import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmanagementassist.domain.dto.admin.AdminRoleDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminRoleEntity;
import com.xz.landmanagementassist.exception.ErrorInfoEnum;
import com.xz.landmanagementassist.service.admin.AdminPermissionService;
import com.xz.landmanagementassist.service.admin.AdminRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * RoleController
 * 
 * @author xuzhu
 * @date 2021-3-18 13:10:27
 */
@RestController
public class RoleController {
    @Autowired
    AdminRoleService adminRoleService;
    @Autowired
    AdminPermissionService adminPermissionService;
    @Autowired
    AdminRolePermissionService adminRolePermissionService;
    @Autowired
    AdminRoleMenuService adminRoleMenuService;

    @GetMapping("/api/admin/role/list")
    public Result<List<AdminRoleDTO>> list() {
        return Result.success(adminRoleService.listDTO());
    }

    @DeleteMapping("/api/admin/role")
    public Result<Boolean> delete(@RequestBody Integer roleId) {
        return Result.success(adminRoleService.removeById(roleId), ErrorInfoEnum.DELETE_SUCCESS);
    }

    @PutMapping("/api/admin/role")
    public Result<Boolean> update(@RequestBody AdminRoleEntity role) {
        return Result.success(adminRoleService.updateById(role), ErrorInfoEnum.UPDATE_SUCCESS);
    }

    @PostMapping("/api/admin/role")
    public Result<Boolean> save(@RequestBody AdminRoleEntity role) {
        return Result.success(adminRoleService.save(role), ErrorInfoEnum.SAVE_SUCCESS);
    }

    @GetMapping("/api/admin/role/permissionList")
    public Result<List<AdminPermissionDTO>> permissionList() {
        return Result.success(adminPermissionService.listDTO());
    }

    @PutMapping("/api/admin/role/updateMenuList")
    public Result updateMenuList(@RequestParam int rid, @RequestBody Map<String, List<Integer>> menusIds) {
        adminRoleMenuService.updateRoleMenu(rid, menusIds);
        return ResultFactory.buildSuccessResult("更新成功");
    }
}
