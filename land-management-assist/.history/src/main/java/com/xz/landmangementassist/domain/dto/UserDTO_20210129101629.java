package com.xz.landmanagementassist.domain.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * 用户DTO
 * 
 * @author xuzhu
 * @Date 2021-1-29 10:09:44
 */
@Data
@Builder
public class UserDTO {

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
     * 状态
     */
    private boolean enabled;

    /**
     * Transient property for storing role owned by current user.
     */
    @Transient
    private List<AdminRole> roles;

}
