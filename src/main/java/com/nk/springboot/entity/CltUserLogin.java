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
public class CltUserLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId("USER_ID")
    private String userId;

    /**
     * 用户类型
     */
    @TableField("USER_TYPE")
    private String userType;

    /**
     * 用户登录号
     */
    @TableField("LOGIN_NO")
    private String loginNo;

    /**
     * 用户中文名称
     */
    @TableField("USER_CHN_NAME")
    private String userChnName;

    /**
     * 登录密码
     */
    @TableField("LOGIN_PWD")
    private String loginPwd;

    /**
     * 密码状态
     */
    @TableField("PWD_STATUS")
    private String pwdStatus;

    /**
     * 密码错误次数
     */
    @TableField("PWD_ERR_NUM")
    private Integer pwdErrNum;

    /**
     * 更新时间
     */
    @TableField("UPDATE_DATE")
    private LocalDate updateDate;

    /**
     * 员工状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 是否超管用户,是为Y,否为N
     */
    @TableField("IS_SUPER")
    private String isSuper;


}
