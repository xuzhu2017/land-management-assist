package com.xz.landmanagementassist.service.impl;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmanagementassist.domain.dto.admin.AdminRoleMenuDTO;
import com.xz.landmanagementassist.domain.entity.admin.AdminRoleMenuEntity;
import com.xz.landmanagementassist.repository.admin.AdminRoleMenuDAO;
import com.xz.landmanagementassist.service.AdminRoleMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * AdminRoleMenuServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminRoleMenuServiceImpl extends ServiceImpl<AdminRoleMenuDAO, AdminRoleMenuEntity>
        implements AdminRoleMenuService {
    @Autowired
    AdminRoleMenuDAO adminRoleMenuDAO;

    @Override
    @Transactional
    public List<AdminRoleMenuDTO> updateList(Integer roleId, Map<String, List<Integer>> menusIds) {
        QueryWrapper<AdminRoleMenuEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("role_id", roleId);
        adminRoleMenuDAO.delete(queryWrapper);

        List<AdminRoleMenuEntity> rms = new ArrayList<>();
        for (Integer mid : menusIds.get("menusIds")) {
            AdminRoleMenu rm = new AdminRoleMenu();
            rm.setMid(mid);
            rm.setRid(rid);
            rms.add(rm);
        }
        return null;
    }

}
