package com.xz.landmanagementassist.service;

public interface UserService {
    public ResponseDTO<PageResultDTO<EmployeeVO>> selectEmployeeList(EmployeeQueryDTO queryDTO)
}
