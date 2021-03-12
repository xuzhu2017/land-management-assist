package com.xz.landmanagementassist.domain.dto.admin;

import java.sql.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
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
