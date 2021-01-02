package com.nk.springboot.entity;

import java.time.LocalDateTime;
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
public class ClBBaDictType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TYPE_NO")
    private String typeNo;

    @TableField("TYPE_NAME")
    private String typeName;

    @TableField("VER_NO")
    private Integer verNo;

    @TableField("CRT_TIME")
    private LocalDateTime crtTime;

    @TableField("UPD_TIME")
    private LocalDateTime updTime;

    @TableField("CRT_USER_NO")
    private String crtUserNo;

    @TableField("UPD_USER_NO")
    private String updUserNo;

    @TableId("TYPE_SEQ_NO")
    private String typeSeqNo;

    @TableField("STAT")
    private String stat;


}
