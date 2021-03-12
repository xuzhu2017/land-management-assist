package com.xz.landmanagementassist.service;

import java.util.List;

import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.AdminUserRoleDTO;

public interface AdminUserRoleService {
    public Result<List<AdminUserRoleDTO>> listAllByUid(Integer uid);
}
