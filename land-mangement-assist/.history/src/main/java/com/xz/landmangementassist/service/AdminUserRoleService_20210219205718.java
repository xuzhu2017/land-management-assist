package com.xz.landmangementassist.service;

import java.util.List;

import com.xz.landmangementassist.domain.common.Result;
import com.xz.landmangementassist.domain.dto.admin.AdminUserRoleDTO;

public interface AdminUserRoleService {
    public Result<List<AdminUserRoleDTO>> listAllByUid(Integer uid);
}
