package com.xz.landmanagementassist.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 用户实体类
 *
 * @author xuzhu
 * @date 2021-1-29 09:41:36
 */
@Data
@Builder
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

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
