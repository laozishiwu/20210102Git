package com.nk.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wyc
 * @since 2021-01-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CltUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户角色关系ID
     */
    @TableId("USER_ROLE_ID")
    private String userRoleId;

    /**
     * 用户ID
     */
    @TableField("ROLE_ID")
    private String roleId;

    /**
     * 角色ID
     */
    @TableField("USER_ID")
    private String userId;


}
