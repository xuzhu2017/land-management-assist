package com.xz.landmanagementassist.controller.admin;

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

    @GetMapping("/api/menu")
    public Result menu() {
        return ResultFactory.buildSuccessResult(adminMenuService.getMenusByCurrentUser());
    }

    @GetMapping("/api/admin/role/menu")
    public Result listAllMenus() {
        return ResultFactory.buildSuccessResult(adminMenuService.getMenusByRoleId(1));
    }
}
