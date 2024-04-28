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
 * @since 2024-04-28 14:24:45
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("recipient_address")
@ApiModel(value = "RecipientAddressEntity对象", description = "")
public class RecipientAddressEntity {

    @ApiModelProperty("id")
    @TableId(value = "recipient_address_id", type = IdType.AUTO)
    private Integer recipientAddressId;

    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("收件人姓名")
    @TableField("recipient_name")
    private String recipientName;

    @ApiModelProperty("收件人电话")
    @TableField("recipient_phone")
    private String recipientPhone;

    @ApiModelProperty("收件省")
    @TableField("province")
    private String province;

    @ApiModelProperty("收件市")
    @TableField("city")
    private String city;

    @ApiModelProperty("收件区")
    @TableField("area")
    private String area;

    @ApiModelProperty("收件详细地址")
    @TableField("address")
    private String address;

    @ApiModelProperty("收件地址邮编")
    @TableField("`code`")
    private String code;


}
