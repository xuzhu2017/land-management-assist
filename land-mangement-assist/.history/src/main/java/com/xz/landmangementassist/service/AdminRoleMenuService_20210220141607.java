package com.xz.landmangementassist.service;

import java.util.List;

import com.xz.landmangementassist.domain.common.Result;
import com.xz.landmangementassist.domain.dto.admin.AdminRoleMenuDTO;

public interface AdminRoleMenuService {
    public Result<List<AdminRoleMenuDTO>> getListByRoleId(Integer roleId);
}
