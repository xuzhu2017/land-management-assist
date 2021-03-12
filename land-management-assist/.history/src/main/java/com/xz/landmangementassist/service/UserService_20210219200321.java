package com.xz.landmanagementassist.service;

import com.xz.landmanagementassist.domain.common.PagedResult;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.admin.UserQueryDTO;

public interface UserService {
    /**
     * 查询用户列表（分页）
     *
     * @param queryDTO
     * @return
     */
    public Result<PagedResult<UserDTO>> selectEmployeeList(UserQueryDTO queryDTO);

    /**
     * 用户名是否存在
     * 
     * @param username
     * @return
     */
    public boolean isExist(String username);

    /**
     * 按名字获取用户
     * 
     * @param username
     * @return
     */
    public Result<UserDTO> getByUsername(String username);
}
