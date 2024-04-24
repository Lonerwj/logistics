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
 * @since 2024-04-24 21:49:24
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sending_address")
@ApiModel(value = "SendingAddressEntity对象", description = "")
public class SendingAddressEntity {

    @TableId(value = "sendingaddress_id", type = IdType.AUTO)
    private Integer sendingaddressId;

    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("寄件人姓名")
    @TableField("sender_name")
    private String senderName;

    @ApiModelProperty("寄件人电话")
    @TableField("sender_phone")
    private String senderPhone;

    @ApiModelProperty("寄件省")
    @TableField("province")
    private String province;

    @ApiModelProperty("寄件市")
    @TableField("city")
    private String city;

    @ApiModelProperty("寄件区")
    @TableField("area")
    private String area;

    @ApiModelProperty("寄件详细地址")
    @TableField("address")
    private String address;

    @ApiModelProperty("寄件邮编")
    @TableField("`code`")
    private String code;


}
