package com.xz.landmanagementassist.service;

import java.util.List;

import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.AdminRoleMenuDTO;

public interface AdminRoleMenuService {
    public Result<List<AdminRoleMenuDTO>> getListByRoleId(Integer roleId);
}
