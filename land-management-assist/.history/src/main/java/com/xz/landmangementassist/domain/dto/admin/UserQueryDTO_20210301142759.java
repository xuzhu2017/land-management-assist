package com.xz.landmanagementassist.domain.dto.admin;

import java.sql.Date;

import lombok.Data;

@Data
public class UserQueryDTO extends UserDTO {
    /**
     * 开始日期
     */
    private Date beginDate;
    /**
     * 结束日期
     */
    private Date endDate;
}
