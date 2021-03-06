package com.github.yiuman.citrus.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户与组织机构映射
 *
 * @author yiuman
 * @date 2020/4/11
 */
@Data
@TableName("sys_user_organ")
public class UserOrgan {

    @TableId
    private Long userId;

    @TableField(exist = false)
    private User user;

    @TableId
    private Long organId;

    @TableField(exist = false)
    private Organization organ;

    public UserOrgan(Long userId, Long organId) {
        this.userId = userId;
        this.organId = organId;
    }
}
