package com.xz.landmangementassist.service;

public interface UserService {
    public Result<PagedResult<UserDTO>> selectEmployeeList(EmployeeQueryDTO queryDTO)
}
