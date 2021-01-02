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
public class CltOrg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机构ID
     */
    @TableId("ORG_ID")
    private String orgId;

    /**
     * 上级机构ID
     */
    @TableField("PARENT_ORG_ID")
    private String parentOrgId;

    /**
     * 机构名称
     */
    @TableField("ORG_NAME")
    private String orgName;

    /**
     * 客户ID
     */
    @TableField("CUST_ID")
    private String custId;

    /**
     * 显示顺序
     */
    @TableField("ORG_SEQ")
    private Integer orgSeq;

    /**
     * 描述
     */
    @TableField("ORG_DESC")
    private String orgDesc;

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
     * 是否叶子机构
     */
    @TableField("IS_LEAF")
    private String isLeaf;

    /**
     * 机构级别
     */
    @TableField("ORG_LEVEL")
    private Integer orgLevel;

    /**
     * 机构层次
     */
    @TableField("ORG_GRADATION")
    private String orgGradation;

    /**
     * 负责人姓名
     */
    @TableField("MANAGER_NAME")
    private String managerName;

    /**
     * 负责人邮箱
     */
    @TableField("MANAGER_EMAIL")
    private String managerEmail;

    /**
     * 负责人电话
     */
    @TableField("MANAGER_PHONE")
    private String managerPhone;

    /**
     * 扩展字段
     */
    @TableField("EXPANDS")
    private String expands;


}
