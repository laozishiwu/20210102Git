package com.nk.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 功能表
 * </p>
 *
 * @author wyc
 * @since 2021-01-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CltFunc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 功能ID
     */
    @TableId("FUNC_ID")
    private String funcId;

    /**
     * 功能代码
     */
    @TableField("FUNC_CODE")
    private String funcCode;

    /**
     * 功能名称
     */
    @TableField("FUNC_NAME")
    private String funcName;

    /**
     * 上级功能ID
     */
    @TableField("PARENT_FUNC_ID")
    private String parentFuncId;

    /**
     * 显示顺序
     */
    @TableField("FUNC_SEQ")
    private Integer funcSeq;

    /**
     * 是否叶子功能
     */
    @TableField("IS_LEAF")
    private String isLeaf;

    /**
     * 功能描述
     */
    @TableField("FUNC_DESC")
    private String funcDesc;

    /**
     * 功能URL地址
     */
    @TableField("FUNC_URL")
    private String funcUrl;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 菜单类型，１为左侧菜单，２为头部菜单
     */
    @TableField("FUNC_TYPE")
    private Integer funcType;

    /**
     * 权限标识
     */
    @TableField("FUNC_AUTH")
    private String funcAuth;

    /**
     * 功能树路径层次关系，父级与子级ID中间用_隔开
     */
    @TableField("FUNC_PATH_ID")
    private String funcPathId;

    /**
     * 功能树路径层次关系，父级名称与子级名称中间用_隔开
     */
    @TableField("FUNC_PATH_NAME")
    private String funcPathName;


}
