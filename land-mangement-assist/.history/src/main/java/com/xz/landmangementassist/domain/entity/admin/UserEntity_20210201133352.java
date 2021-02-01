package com.xz.landmangementassist.domain.entity.admin;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xz.landmangementassist.domain.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 用户实体类
 *
 * @author xuzhu
 * @date 2021-1-29 09:41:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@TableName("user")
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1942374165554277340L;

    /**
     * 用户名
     */
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
     */
    private String email;

    /**
     * 状态
     */
    private boolean enabled;

}
