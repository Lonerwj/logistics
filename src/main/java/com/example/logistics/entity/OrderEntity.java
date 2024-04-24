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
 * @since 2024-04-24 21:49:24
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("order")
@ApiModel(value = "OrderEntity对象", description = "")
public class OrderEntity {

    @ApiModelProperty("订单编号")
    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    @ApiModelProperty("寄件地址编号")
    @TableField("sendingaddress_id")
    private Integer sendingaddressId;

    @ApiModelProperty("寄件时间")
    @TableField("sending_time")
    private LocalDateTime sendingTime;

    @ApiModelProperty("收件地址编号")
    @TableField("recipientaddress_id")
    private Integer recipientaddressId;

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
