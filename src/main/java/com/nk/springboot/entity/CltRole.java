package com.nk.springboot.entity;

import java.time.LocalDate;
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
public class CltRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableId("ROLE_ID")
    private String roleId;

    /**
     * 角色代码
     */
    @TableField("ROLE_CODE")
    private String roleCode;

    /**
     * 角色名称
     */
    @TableField("ROLE_NAME")
    private String roleName;

    /**
     * 项目ID
     */
    @TableField("PRO_ID")
    private String proId;

    /**
     * 角色类别
     */
    @TableField("ROLE_LEVEL")
    private String roleLevel;

    /**
     * 角色描述
     */
    @TableField("ROLE_DESC")
    private String roleDesc;

    /**
     * 创建人
     */
    @TableField("CREATE_USER")
    private String createUser;

    /**
     * 创建时间
     */
    @TableField("CREATE_DATE")
    private LocalDate createDate;

    /**
     * 更新人
     */
    @TableField("UPDATE_USER")
    private String updateUser;

    /**
     * 更新时间
     */
    @TableField("UPDATE_DATE")
    private LocalDate updateDate;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 是否超管角色,是为Y,否为N
     */
    @TableField("IS_SUPER")
    private String isSuper;


}
