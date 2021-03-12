package com.xz.landmanagementassist.service;

import com.xz.landmanagementassist.domain.common.Result;

public interface UserService {
    public Result<PagedResult<UserDTO>> selectEmployeeList(UserQueryDTO queryDTO)
}
