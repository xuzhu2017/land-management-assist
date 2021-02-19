package com.xz.landmangementassist.service;

import com.xz.landmangementassist.domain.common.Result;

public interface UserService {
    public Result<PagedResult<UserDTO>> selectEmployeeList(UserQueryDTO queryDTO)
}
