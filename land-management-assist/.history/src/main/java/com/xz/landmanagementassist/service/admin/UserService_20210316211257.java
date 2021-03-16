package com.xz.landmanagementassist.service.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xz.landmanagementassist.domain.common.Result;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;
import com.xz.landmanagementassist.domain.dto.query.UserQueryDTO;
import com.xz.landmanagementassist.domain.entity.admin.UserEntity;

/**
 * UserService
 * 
 * @author xuzhu
 * @date 2021-2-19 20:03:53
 */
public interface UserService extends IService<UserEntity> {
    /**
     * 查询用户列表（分页）
     *
     * @param queryDTO
     * @return
     */
    public IPage<UserEntity> selectUserList(UserQueryDTO queryDTO);

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
     * 登录
     * 
     * @param user
     * @return
     */
    public Result<UserDTO> login(UserDTO user);

    /**
     * 注册
     * 
     * @param user
     * @return
     */
    public Result<boolean> register(UserDTO user);

    /**
     * 更新
     * 
     * @param user
     * @return
     */
    public boolean update(UserDTO user);

    /**
     * 删除
     * 
     * @param user
     * @return
     */
    public boolean delete(UserDTO user);

    /**
     * 重置密码
     * 
     * @param user
     * @return
     */
    public UserDTO resetPassword(UserDTO user);
}
