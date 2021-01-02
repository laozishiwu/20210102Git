package com.nk.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统环境变量配置表
 * </p>
 *
 * @author wyc
 * @since 2021-01-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CltCloudConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "cloud_config_id", type = IdType.AUTO)
    private Integer cloudConfigId;

    /**
     * 应用名，GLOBAL为全局
     */
    private String cloudConfigName;

    /**
     * 属性名
     */
    private String cloudConfigKey;

    /**
     * 参数描述
     */
    private String cloudConfigDesc;

    /**
     * 开发环境值
     */
    private String cloudConfigDevValue;

    /**
     * 测试环境值
     */
    private String cloudConfigTestValue;

    /**
     * 正式环境值
     */
    private String cloudConfigProdValue;


}
