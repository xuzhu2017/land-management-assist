package com.xz.landmangementassist.service;

public interface UserService {
    public ResponseDTO<PageResultDTO<EmployeeVO>> selectEmployeeList(EmployeeQueryDTO queryDTO)
}
