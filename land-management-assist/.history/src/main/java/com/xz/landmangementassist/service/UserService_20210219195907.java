package com.xz.landmanagementassist.service;

public interface UserService {
    public Result<PagedResult<EmployeeVO>> selectEmployeeList(EmployeeQueryDTO queryDTO)
}
