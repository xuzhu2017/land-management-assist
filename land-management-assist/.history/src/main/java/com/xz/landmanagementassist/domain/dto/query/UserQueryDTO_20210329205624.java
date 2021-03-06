package com.xz.landmanagementassist.domain.dto.query;

import java.sql.Date;

import com.xz.landmanagementassist.domain.common.PageParam;
import com.xz.landmanagementassist.domain.dto.admin.UserDTO;

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
public class UserQueryDTO extends UserDTO implements IQuery {

    /**
     * 只有分页，无条件的构造函数
     */
    public UserQueryDTO(PageParam pageParam) {
        this.pageParam = pageParam;
    }

    /**
     * 开始日期
     */
    private Date beginDate;
    /**
     * 结束日期
     */
    private Date endDate;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 分页和排序
     */
    private PageParam pageParam;
}
