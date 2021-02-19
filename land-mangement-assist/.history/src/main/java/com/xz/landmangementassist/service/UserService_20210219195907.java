package com.xz.landmangementassist.service;

public interface UserService {
    public Result<PagedResult<EmployeeVO>> selectEmployeeList(EmployeeQueryDTO queryDTO)
}
