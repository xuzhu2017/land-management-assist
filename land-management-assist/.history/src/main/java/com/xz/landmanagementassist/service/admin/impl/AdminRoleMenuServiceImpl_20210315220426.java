package com.xz.landmanagementassist.service.admin.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmanagementassist.domain.entity.admin.AdminRoleMenuEntity;
import com.xz.landmanagementassist.repository.admin.AdminRoleMenuDAO;
import com.xz.landmanagementassist.service.admin.AdminRoleMenuService;

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
    public void updateList(Integer roleId, Map<String, List<Integer>> menusIds) {
        QueryWrapper<AdminRoleMenuEntity> queryWrapper = new QueryWrapper<>();
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
