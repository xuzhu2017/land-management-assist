package com.xz.landmanagementassist.controller.admin;

import java.util.List;

import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.AdminMenuDTO;
import com.xz.landmanagementassist.service.admin.AdminMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MenuController
 * 
 * @author xuzhu
 * @date 2021-3-18 13:10:27
 */
@RestController
public class MenuController {
    @Autowired
    AdminMenuService adminMenuService;

    @GetMapping("/api/admin/menu/currentUserMenus")
    public Result<List<AdminMenuDTO>> currentUserMenus() {
        return Result.success(adminMenuService.getMenusByCurrentUser());
    }

    @GetMapping("/api/admin/menu/menusOfRole")
    public Result menusOfRole() {
        return ResultFactory.buildSuccessResult(adminMenuService.getMenusByRoleId(1));
    }
}
