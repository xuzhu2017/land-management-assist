package com.xz.landmanagementassist.service;

import com.xz.landmanagementassist.domain.common.PagedResult;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.admin.UserQueryDTO;

public interface UserService {
    public Result<PagedResult<UserDTO>> selectEmployeeList(UserQueryDTO queryDTO);
}
