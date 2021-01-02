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
public class CltUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId("USER_ID")
    private String userId;

    /**
     * 客户ID
     */
    @TableField("CUST_ID")
    private String custId;

    /**
     * 机构ID
     */
    @TableField("ORG_ID")
    private String orgId;

    /**
     * 性别
     */
    @TableField("GENDER")
    private String gender;

    /**
     * 民族
     */
    @TableField("NATIONALITY")
    private String nationality;

    /**
     * 证件类型
     */
    @TableField("ID_TYPE")
    private String idType;

    /**
     * 证件号码
     */
    @TableField("ID_NO")
    private String idNo;

    /**
     * 婚姻状况
     */
    @TableField("MARRIAGE")
    private String marriage;

    /**
     * 政治面貌
     */
    @TableField("POLITICS")
    private String politics;

    /**
     * 籍贯
     */
    @TableField("FAMILY_COUNTY_ID")
    private String familyCountyId;

    /**
     * 电子邮箱
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 手机号码
     */
    @TableField("CELL_PHONE")
    private String cellPhone;

    /**
     * 通讯地址
     */
    @TableField("ADDRESS")
    private String address;

    /**
     * 出生日期
     */
    @TableField("BIRTHDAY")
    private LocalDate birthday;

    /**
     * 毕业院校
     */
    @TableField("GRADUATED_SCHOOL")
    private String graduatedSchool;

    /**
     * 毕业时间
     */
    @TableField("GRADUATED_DATE")
    private String graduatedDate;

    /**
     * 毕业专业
     */
    @TableField("GRADUATED_SPECIALTY")
    private String graduatedSpecialty;

    /**
     * 学历
     */
    @TableField("EDU_CODE")
    private String eduCode;

    /**
     * 技能证书
     */
    @TableField("SKILLS_CERTIFICATE")
    private String skillsCertificate;

    /**
     * 专业特长
     */
    @TableField("SPECIALTY")
    private String specialty;

    /**
     * 工作状态
     */
    @TableField("WORK_STATUS")
    private String workStatus;

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
     * 扩展字段
     */
    @TableField("EXPANDS")
    private String expands;


}
