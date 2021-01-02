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
 * 登陆日志
 * </p>
 *
 * @author wyc
 * @since 2021-01-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CltLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志ID
     */
    @TableId("LOG_ID")
    private String logId;

    /**
     * 登录账号
     */
    @TableField("LOGIN_NO")
    private String loginNo;

    /**
     * 用户中文名称
     */
    @TableField("USER_CHN_NAME")
    private String userChnName;

    /**
     * 会话ID
     */
    @TableField("SESSION_ID")
    private String sessionId;

    /**
     * 登录时间
     */
    @TableField("LOGIN_DATE")
    private LocalDate loginDate;

    /**
     * 退出时间
     */
    @TableField("EXIT_DATE")
    private LocalDate exitDate;

    /**
     * 登录IP
     */
    @TableField("LOGIN_IP")
    private String loginIp;

    /**
     * 登录状态
     */
    @TableField("STAUTS")
    private String stauts;

    /**
     * 密码尝试登录次数
     */
    @TableField("PWD_LOGIN_NUM")
    private Integer pwdLoginNum;


}
