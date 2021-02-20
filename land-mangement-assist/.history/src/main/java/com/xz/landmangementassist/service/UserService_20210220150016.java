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
    public UserDTO getByUsername(String username);

    /**
     * 获取用户
     * 
     * @param username
     * @param password
     * @return
     */
    public UserDTO get(String username, String password);

    /**
     * 注册
     * 
     * @param user
     * @return
     */
    public UserDTO register(UserDTO user);

    /**
     * 更新
     * 
     * @param user
     * @return
     */
    public UserDTO update(UserDTO user);

    /**
     * 删除
     * 
     * @param user
     * @return
     */
    public UserDTO delete(UserDTO user);

    /**
     * 重置密码
     * 
     * @param user
     * @return
     */
    public UserDTO resetPassword(UserDTO user);
}
