package com.xz.landmanagementassist.domain.dto.admin;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.xz.landmanagementassist.domain.dto.base.BaseDTO;

/**
 * 用户DTO
 * 
 * @author xuzhu
 * @Date 2021-1-29 10:09:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends BaseDTO {

    /**
     * 用户名
     */
    @NotEmpty(message = "用户名不能为空")
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * Salt for encoding.
     */
    private String salt;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮件地址
     *
     * A Email address can be null,but should be correct if exists.
     */
    @Email(message = "请输入正确的邮箱")
    private String email;

    /**
     * 逻辑删除
     */
    private boolean deleted;

    /**
     * 用户拥有的角色列表
     */
    private List<AdminRoleDTO> roleList;

}
