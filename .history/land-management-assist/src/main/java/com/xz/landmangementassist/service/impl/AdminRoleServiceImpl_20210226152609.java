package com.xz.landmangementassist.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmangementassist.domain.dto.admin.AdminMenuDTO;
import com.xz.landmangementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmangementassist.domain.dto.admin.AdminRoleDTO;
import com.xz.landmangementassist.domain.entity.admin.AdminRoleEntity;
import com.xz.landmangementassist.domain.entity.admin.AdminRolePermissionEntity;
import com.xz.landmangementassist.repository.admin.AdminRoleDAO;
import com.xz.landmangementassist.repository.admin.AdminRolePermissionDAO;
import com.xz.landmangementassist.service.AdminRoleService;
import com.xz.landmangementassist.utils.MyBeanUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AdminRoleServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleDAO, AdminRoleEntity> implements AdminRoleService {
    @Autowired
    AdminRoleDAO adminRoleDAO;
    @Autowired
    AdminRolePermissionDAO adminRolePermissionDAO;

    @Override
    public List<AdminRoleDTO> listDTO() {
        List<AdminRoleDTO> roleList = new ArrayList<>();
        list().stream().forEach(r -> {
            roleList.add(MyBeanUtil.transformFrom(r, AdminRoleDTO.class));
        });

        List<Integer> roleIdList = roleList.stream().map(AdminRoleDTO::getId).collect(Collectors.toList());
        // 角色菜单
        List<AdminMenuDTO> roleMenuList = adminRoleDAO.getMenuListByRoleId(roleIdList);
        // 角色权限
        List<AdminPermissionDTO> rolePermissionList = adminRoleDAO.getPermissionListByRoleId(roleIdList);

        roleList.stream().forEach(role -> {
            role.setMenuList(
                    roleMenuList.stream().filter(m -> m.getRoleId().equals(role.getId())).collect(Collectors.toList()));
            role.setPermissionList(rolePermissionList.stream().filter(p -> p.getRoleId().equals(role.getId()))
                    .collect(Collectors.toList()));
        });

        return roleList;
    }

    @Override
    public boolean saveRolePermission(AdminRoleDTO adminRole) {

        AdminRoleEntity entity = MyBeanUtil.transformFrom(adminRole, AdminRoleEntity.class);
        boolean success = saveOrUpdate(entity);

        // 保存角色对应权限
        QueryWrapper<AdminRolePermissionEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("role_id", adminRole.getId());
        adminRolePermissionDAO.delete(queryWrapper);
        List<AdminRolePermissionEntity> rolePermissionList = new ArrayList<>();
        adminRole.getPermissionList().forEach(p -> {
            AdminRolePermissionEntity rp = new AdminRolePermissionEntity();
            rp.setRoleId(adminRole.getId());
            rp.setPermissionId(p.getId());
            rolePermissionList.add(rp);
        });

        return success;
    }

    @Override
    public List<AdminRoleDTO> getListByUsername(String username) {
        return adminRoleDAO.getListByUsername(username);
    }

}
