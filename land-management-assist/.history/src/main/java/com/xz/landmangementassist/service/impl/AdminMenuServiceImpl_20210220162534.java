package com.xz.landmanagementassist.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xz.landmanagementassist.domain.dto.admin.AdminMenuDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminMenuEntity;
import com.xz.landmanagementassist.domain.entity.admin.UserEntity;
import com.xz.landmanagementassist.repository.admin.AdminMenuDAO;
import com.xz.landmanagementassist.repository.admin.UserDAO;
import com.xz.landmanagementassist.service.AdminMenuService;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AdminPermissionServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminMenuServiceImpl implements AdminMenuService {

    @Autowired
    AdminMenuDAO adminMenuDAO;
    @Autowired
    UserDAO userDAO;

    @Override
    public List<AdminMenuDTO> getListByParentId(Integer parentId) {
        QueryWrapper<AdminMenuEntity> wrapper = new QueryWrapper<AdminMenuEntity>();
        wrapper.eq("parentId", parentId);
        List<AdminMenuDTO> list = new ArrayList<AdminMenuDTO>();
        adminMenuDAO.selectList(wrapper).stream().forEach(menu -> {
            AdminMenuDTO dto = new AdminMenuDTO();
            dto.convertFrom(menu);
            list.add(dto);
        });
        return list;
    }

    @Override
    public List<AdminMenuDTO> getMenusByCurrentUser() {
        // 获取当前用户信息
        String username = SecurityUtils.getSubject().getPrincipal().toString();
        QueryWrapper<UserEntity> userWrapper = new QueryWrapper<UserEntity>();
        userWrapper.eq("username", username);
        UserEntity user = userDAO.selectOne(userWrapper);

        // Get roles' ids of current user.
        List<Integer> rids = adminUserRoleService.listAllByUid(user.getId()).stream().map(AdminUserRole::getRid)
                .collect(Collectors.toList());

        // Get menu items of these roles.
        List<Integer> menuIds = adminRoleMenuService.findAllByRid(rids).stream().map(AdminRoleMenu::getMid)
                .collect(Collectors.toList());
        List<AdminMenu> menus = adminMenuDAO.findAllById(menuIds).stream().distinct().collect(Collectors.toList());

        // Adjust the structure of the menu.
        handleMenus(menus);
        return menus;
    }

    @Override
    public List<AdminMenuDTO> getMenusByRoleId(Integer roleId) {
        // TODO Auto-generated method stub
        return null;
    }

}
