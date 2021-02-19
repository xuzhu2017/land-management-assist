package com.xz.landmangementassist.service;

import com.xz.landmangementassist.domain.common.PagedResult;
import com.xz.landmangementassist.domain.common.Result;
import com.xz.landmangementassist.domain.dto.admin.UserDTO;
import com.xz.landmangementassist.domain.dto.admin.UserQueryDTO;

public interface UserService {
    public Result<PagedResult<UserDTO>> selectEmployeeList(UserQueryDTO queryDTO);
}
