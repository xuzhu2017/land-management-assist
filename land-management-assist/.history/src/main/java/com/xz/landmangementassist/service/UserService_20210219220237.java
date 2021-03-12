package com.xz.landmanagementassist.service;

import com.xz.landmanagementassist.domain.common.PagedResult;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.admin.UserQueryDTO;

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
    public Result<Boolean> isExist(String username);

    /**
     * 按名字获取用户
     * 
     * @param username
     * @return
     */
    public Result<UserDTO> getByUsername(String username);

    /**
     * 获取用户
     * 
     * @param username
     * @param password
     * @return
     */
    public Result<UserDTO> get(String username, String password);

    /**
     * 注册
     * 
     * @param user
     * @return
     */
    public Result<UserDTO> register(UserDTO user);

    /**
     * 更新
     * 
     * @param user
     * @return
     */
    public Result<UserDTO> update(UserDTO user);

    /**
     * 删除
     * 
     * @param user
     * @return
     */
    public Result<UserDTO> delete(UserDTO user);

    /**
     * 重置密码
     * 
     * @param user
     * @return
     */
    public Result<UserDTO> resetPassword(UserDTO user);
}
