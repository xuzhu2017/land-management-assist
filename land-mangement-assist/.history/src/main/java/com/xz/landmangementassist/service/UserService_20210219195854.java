package com.xz.landmangementassist.service;

public interface UserService {
    public Result<PageResultDTO<EmployeeVO>> selectEmployeeList(EmployeeQueryDTO queryDTO)
}
