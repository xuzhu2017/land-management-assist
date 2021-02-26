package com.xz.landmangementassist.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xz.landmangementassist.domain.dto.admin.AdminPermissionDTO;
import com.xz.landmangementassist.domain.entity.admin.AdminPermissionEntity;
import com.xz.landmangementassist.repository.admin.AdminPermissionDAO;
import com.xz.landmangementassist.service.AdminPermissionService;
import com.xz.landmangementassist.utils.MyBeanUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AdminPermissionServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminPermissionServiceImpl extends ServiceImpl<AdminPermissionDAO, AdminRoleMenuEntity>
        implements AdminPermissionService {

    @Autowired
    AdminPermissionDAO adminPermissionDAO;

    @Override
    public List<AdminPermissionDTO> listDTO() {
        List<AdminPermissionDTO> list = new ArrayList<>();
        list().forEach(p -> {
            list.add(MyBeanUtil.transformFrom(p, AdminPermissionDTO.class));
        });
        return list;
    }

    @Override
    public boolean needFilter(String requestAPI) {
        return list().stream().anyMatch(p -> requestAPI.startsWith(p.getUrl()));
    }

    @Override
    public Set<String> listPermissionURLsByUser(String username) {
        return adminPermissionDAO.getListByUsername(username).stream().map(AdminPermissionEntity::getUrl)
                .collect(Collectors.toSet());
    }

}
