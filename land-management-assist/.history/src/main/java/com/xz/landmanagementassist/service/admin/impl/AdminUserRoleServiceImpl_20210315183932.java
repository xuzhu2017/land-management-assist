package com.xz.landmanagementassist.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xz.landmanagementassist.domain.entity.admin.AdminUserRoleEntity;
import com.xz.landmanagementassist.repository.admin.AdminUserRoleDAO;
import com.xz.landmanagementassist.service.AdminUserRoleService;

import org.springframework.stereotype.Service;

/**
 * AdminUserRoleServiceImpl
 * 
 * @author xuzhu
 * @date 2021-2-20 14:16:19
 */
@Service
public class AdminUserRoleServiceImpl extends ServiceImpl<AdminUserRoleDAO, AdminUserRoleEntity>
        implements AdminUserRoleService {

}
