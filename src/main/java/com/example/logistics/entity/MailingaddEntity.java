package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lonerW
 * @since 2024-04-24 23:24:42
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("mailingadd")
@ApiModel(value = "MailingaddEntity对象", description = "")
public class MailingaddEntity {

    @TableId(value = "mAddId", type = IdType.AUTO)
    private Long mAddId;

    @TableField("areaId")
    private Integer areaId;

    @TableField("userId")
    private Long userId;

    @TableField("mAddName")
    private String mAddName;

    @TableField("mAddTel")
    private String mAddTel;

    @TableField("mAddInfo")
    private String mAddInfo;

    @TableField("mAddLabel")
    private Integer mAddLabel;

    @TableField("postcode")
    private String postcode;


}
