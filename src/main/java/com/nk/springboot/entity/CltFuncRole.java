package com.nk.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 功能角色表
 * </p>
 *
 * @author wyc
 * @since 2021-01-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CltFuncRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 功能角色关系ID
     */
    @TableId("FUNC_ROLE_ID")
    private String funcRoleId;

    /**
     * 角色ID
     */
    @TableField("ROLE_ID")
    private String roleId;

    /**
     * 功能ID
     */
    @TableField("FUNC_ID")
    private String funcId;


}
