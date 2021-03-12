package com.xz.landmanagementassist.service;

public interface UserService {
    public Result<PagedResult<UserDTO>> selectEmployeeList(EmployeeQueryDTO queryDTO)
}
