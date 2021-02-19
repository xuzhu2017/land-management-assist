package com.xz.landmangementassist.service;

import com.xz.landmangementassist.domain.common.PagedResult;
import com.xz.landmangementassist.domain.common.Result;
import com.xz.landmangementassist.domain.dto.admin.UserDTO;
import com.xz.landmangementassist.domain.dto.admin.UserQueryDTO;

public interface UserService {
    /**
     * 查询员工列表（分页）
     *
     * @param queryDTO
     * @return
     */
    public Result<PagedResult<UserDTO>> selectEmployeeList(UserQueryDTO queryDTO);
}
