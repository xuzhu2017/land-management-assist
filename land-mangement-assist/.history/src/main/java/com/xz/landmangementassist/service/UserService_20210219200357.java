package com.xz.landmangementassist.service;

import com.xz.landmangementassist.domain.common.PagedResult;
import com.xz.landmangementassist.domain.common.Result;
import com.xz.landmangementassist.domain.dto.admin.UserDTO;
import com.xz.landmangementassist.domain.dto.admin.UserQueryDTO;

/**
 * UserService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:03:53
 */
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
