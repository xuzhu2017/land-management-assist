package com.xz.landmanagementassist.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xz.landmanagementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminPermissionEntity;
import com.xz.landmanagementassist.repository.admin.AdminPermissionDAO;
import com.xz.landmanagementassist.service.AdminPermissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AdminPermissionServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminPermissionServiceImpl implements AdminPermissionService {

    @Autowired
    AdminPermissionDAO adminPermissionDAO;

    @Override
    public List<AdminPermissionDTO> list() {
        List<AdminPermissionDTO> list = new ArrayList<>();
        adminPermissionDAO.selectList(new QueryWrapper<AdminPermissionEntity>()).forEach(p -> {
            AdminPermissionDTO dto = new AdminPermissionDTO();
            dto.convertFrom(p);
            list.add(dto);
        });
        return list;
    }

    @Override
    public boolean needFilter(String requestAPI) {
        return list().stream().anyMatch(p -> requestAPI.startsWith(p.getUrl()));
    }

    @Override
    public Set<String> listPermissionURLsByUser(String username) {
        // TODO Auto-generated method stub
        return adminPermissionDAO.getListByUsername(username).stream().map(AdminPermission::getUrl)
                .collect(Collectors.toSet());
    }

}
