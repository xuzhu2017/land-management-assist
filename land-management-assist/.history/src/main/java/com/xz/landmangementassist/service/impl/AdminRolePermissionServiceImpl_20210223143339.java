package com.xz.landmanagementassist.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmanagementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmanagementassist.domain.dto.admin.AdminRolePermissionDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminRolePermissionEntity;
import com.xz.landmanagementassist.repository.admin.AdminRolePermissionDAO;
import com.xz.landmanagementassist.service.AdminRolePermissionService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * AdminRolePermissionServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminRolePermissionServiceImpl extends ServiceImpl<AdminRolePermissionDAO, AdminRolePermissionEntity>
        implements AdminRolePermissionService {

    @Override
    @Transactional
    public void saveRolePermissionList(Integer roleId, List<AdminPermissionDTO> adminPermissionList) {
        QueryWrapper<AdminRolePermissionEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("role_id", roleId);
        adminRoleMenuDAO.delete(queryWrapper);

        List<AdminRoleMenuEntity> list = new ArrayList<>();
        for (Integer mid : menusIds.get("menusIds")) {
            AdminRoleMenuEntity rm = new AdminRoleMenuEntity();
            rm.setMemuId(mid);
            rm.setRoleId(roleId);
            list.add(rm);
        }

        saveBatch(list);
    }

}
