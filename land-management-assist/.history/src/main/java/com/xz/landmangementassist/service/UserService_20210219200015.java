package com.xz.landmanagementassist.service;

import com.xz.landmanagementassist.domain.common.PagedResult;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.admin.UserQueryDTO;

public interface UserService {
    /**
     * 查询员工列表（分页）
     *
     * @param queryDTO
     * @return
     */
    public Result<PagedResult<UserDTO>> selectEmployeeList(UserQueryDTO queryDTO);
}
