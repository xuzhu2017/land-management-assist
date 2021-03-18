package com.xz.landmanagementassist.controller.admin;

import java.util.List;

import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.AdminRoleDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminRoleEntity;
import com.xz.landmanagementassist.exception.ErrorInfoEnum;
import com.xz.landmanagementassist.service.admin.AdminRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
    public Result update(@RequestBody AdminRoleEntity requestRole) {
        return Result.success(adminRoleService.update(), ErrorInfoEnum.DELETE_SUCCESS);
    }

    @PostMapping("/api/admin/role")
    public Result addRole(@RequestBody AdminRole requestRole) {
        adminRoleService.editRole(requestRole);
        return ResultFactory.buildSuccessResult("修改用户成功");
    }

    @GetMapping("/api/admin/role/perm")
    public Result listPerms() {
        return ResultFactory.buildSuccessResult(adminPermissionService.list());
    }

    @PutMapping("/api/admin/role/menu")
    public Result updateRoleMenu(@RequestParam int rid, @RequestBody Map<String, List<Integer>> menusIds) {
        adminRoleMenuService.updateRoleMenu(rid, menusIds);
        return ResultFactory.buildSuccessResult("更新成功");
    }
}
