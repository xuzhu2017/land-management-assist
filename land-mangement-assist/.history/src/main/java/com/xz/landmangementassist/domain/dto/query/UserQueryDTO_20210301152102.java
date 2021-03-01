package com.xz.landmangementassist.domain.dto.query;

import java.sql.Date;

import com.xz.landmangementassist.domain.common.PageParam;
import com.xz.landmangementassist.domain.dto.admin.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 查询用户
 * 
 * @author xuzhu
 * @date 2021-3-1 15:12:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserQueryDTO extends UserDTO implements  {
    /**
     * 开始日期
     */
    private Date beginDate;
    /**
     * 结束日期
     */
    private Date endDate;
    /**
     * 排序
     */
    private PageParam pageParam;
}
