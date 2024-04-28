package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
@TableName("orderss")
@ApiModel(value = "OrderssEntity对象", description = "")
public class OrderssEntity {

    @ApiModelProperty("订单编号")
    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    @ApiModelProperty("寄件地址编号")
    @TableField("sending_address_id")
    private Integer sendingAddressId;

    @ApiModelProperty("寄件时间")
    @TableField("sending_time")
    private LocalDateTime sendingTime;

    @ApiModelProperty("收件地址编号")
    @TableField("recipient_address_id")
    private Integer recipientAddressId;

    @ApiModelProperty("运输方式（快件，普件）")
    @TableField("delivery_type")
    private String deliveryType;

    @ApiModelProperty("收货方式（网点，上门）")
    @TableField("receiving_type")
    private String receivingType;

    @ApiModelProperty("上门时间")
    @TableField("home_time")
    private LocalDateTime homeTime;

    @ApiModelProperty("物品类型")
    @TableField("item_type")
    private String itemType;

    @ApiModelProperty("保价状态")
    @TableField("baojia")
    private String baojia;

    @ApiModelProperty("预计时间")
    @TableField("estimated_deliverytime")
    private LocalDateTime estimatedDeliverytime;

    @ApiModelProperty("支付方式")
    @TableField("pay_way")
    private String payWay;

    @ApiModelProperty("支付状态")
    @TableField("pay_status")
    private String payStatus;

    @ApiModelProperty("支付金额")
    @TableField("payment_amount")
    private Float paymentAmount;

    @ApiModelProperty("办理人")
    @TableField("principal_id")
    private Integer principalId;

    @ApiModelProperty("备注")
    @TableField("memo")
    private String memo;


}
