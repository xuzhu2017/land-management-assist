package com.xz.landmanagementassist.service.admin.impl;

import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmanagementassist.constant.GeneralConstant;
import com.xz.landmanagementassist.domain.dto.admin.AdminMenuDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminMenuEntity;
import com.xz.landmanagementassist.repository.admin.AdminMenuDAO;
import com.xz.landmanagementassist.service.admin.AdminMenuService;
import com.xz.landmanagementassist.utils.MyBeanUtil;

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
public class AdminMenuServiceImpl extends ServiceImpl<AdminMenuDAO, AdminMenuEntity> implements AdminMenuService {

    @Autowired
    AdminMenuDAO adminMenuDAO;

    @Override
    public List<AdminMenuDTO> getMenusByCurrentUser() {
        // 获取当前用户菜单
        List<AdminMenuEntity> menuList = adminMenuDAO
                .getMenuListByCurrentUser(SecurityUtils.getSubject().getPrincipal().toString());

        return treeMenuList(menuList);
    }

    @Override
    public List<AdminMenuDTO> getMenusByRoleId(Integer roleId) {
        List<AdminMenuEntity> menuList = adminMenuDAO.getMenuListByRoleId(roleId);
        return treeMenuList(menuList);
    }

    /**
     * 树形菜单结构
     * 
     * @param menuList
     * @return
     */
    private List<AdminMenuDTO> treeMenuList(List<AdminMenuEntity> menuList) {

        List<AdminMenuDTO> dtoList = new ArrayList<>();
        menuList.stream().forEach(menu -> {
            if (menu.getParentId().equals(GeneralConstant.EMPTY_ID)) {
                AdminMenuDTO dto = MyBeanUtil.transformFrom(menu, AdminMenuDTO.class);
                dto.setChildren(getMenuChild(dto.getId(), menuList));
                dtoList.add(dto);
            }
        });
        return dtoList;
    }

    /**
     * 获取子菜单
     * 
     * @param parentId
     * @param menuList
     * @return
     */
    private List<AdminMenuDTO> getMenuChild(Integer parentId, List<AdminMenuEntity> menuList) {
        List<AdminMenuDTO> dtoList = new ArrayList<>();
        menuList.stream().filter(menu -> menu.getParentId().equals(parentId)).forEach(menu -> {
            AdminMenuDTO dto = MyBeanUtil.transformFrom(menu, AdminMenuDTO.class);
            dto.setChildren(getMenuChild(dto.getId(), menuList));
            dtoList.add(dto);
        });
        return dtoList;
    }
}
