package com.xz.landmangementassist.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xz.landmangementassist.constant.GeneralConstant;
import com.xz.landmangementassist.domain.dto.admin.AdminMenuDTO;
import com.xz.landmangementassist.domain.entity.admin.AdminMenuEntity;
import com.xz.landmangementassist.repository.admin.AdminMenuDAO;
import com.xz.landmangementassist.service.AdminMenuService;

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

    @Override
    public List<AdminMenuDTO> getListByParentId(Integer parentId) {
        QueryWrapper<AdminMenuEntity> wrapper = new QueryWrapper<AdminMenuEntity>();
        wrapper.eq("parentId", parentId);
        List<AdminMenuDTO> list = new ArrayList<>();
        adminMenuDAO.selectList(wrapper).stream().forEach(menu -> {
            AdminMenuDTO dto = new AdminMenuDTO();
            dto.convertFrom(menu);
            list.add(dto);
        });
        return list;
    }

    @Override
    public List<AdminMenuDTO> getMenusByCurrentUser() {
        // 获取当前用户菜单
        List<AdminMenuEntity> menuList = adminMenuDAO
                .getMenuListByCurrentUser(SecurityUtils.getSubject().getPrincipal().toString());

        return treeMenuList(menuList);
    }

    @Override
    public List<AdminMenuDTO> getMenusByRoleId(Integer roleId) {
        // TODO Auto-generated method stub
        return null;
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
            if (menu.getId().equals(GeneralConstant.EMPTY_ID)) {
                AdminMenuDTO dto = new AdminMenuDTO();
                dto.convertFrom(menu);
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
            AdminMenuDTO dto = new AdminMenuDTO();
            dto.convertFrom(menu);
            dto.setChildren(getMenuChild(dto.getId(), menuList));
            dtoList.add(dto);
        });
        return dtoList;
    }
}
