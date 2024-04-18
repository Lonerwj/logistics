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
 * @since 2024-04-18 23:13:03
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

    @ApiModelProperty("寄件人姓名")
    @TableField("sender_name")
    private String senderName;

    @ApiModelProperty("寄件人电话")
    @TableField("sender_phone")
    private String senderPhone;

    @ApiModelProperty("寄件人省份")
    @TableField("sending_province")
    private String sendingProvince;

    @ApiModelProperty("寄件人市")
    @TableField("sending_city")
    private String sendingCity;

    @ApiModelProperty("寄件人区")
    @TableField("sending_area")
    private String sendingArea;

    @ApiModelProperty("寄件人详细地址")
    @TableField("sending_address")
    private String sendingAddress;

    @ApiModelProperty("寄件人邮编")
    @TableField("sending_code")
    private String sendingCode;

    @ApiModelProperty("寄件时间")
    @TableField("sending_time")
    private LocalDateTime sendingTime;

    @ApiModelProperty("收件人姓名")
    @TableField("recipient_name")
    private String recipientName;

    @ApiModelProperty("收件人电话")
    @TableField("recipient_phone")
    private String recipientPhone;

    @ApiModelProperty("收件人省份")
    @TableField("recipient_province")
    private String recipientProvince;

    @ApiModelProperty("收件人市")
    @TableField("recipient_city")
    private String recipientCity;

    @ApiModelProperty("收件人区")
    @TableField("recipient_area")
    private String recipientArea;

    @ApiModelProperty("收件人详细地址")
    @TableField("recipient_address")
    private String recipientAddress;

    @ApiModelProperty("收件人邮编")
    @TableField("recipient_code")
    private String recipientCode;

    @ApiModelProperty("运输方式（快件，普件）")
    @TableField("delivery_type")
    private String deliveryType;

    @ApiModelProperty("收货方式")
    @TableField("receiving_type")
    private String receivingType;

    @ApiModelProperty("上门时间")
    @TableField("home_time")
    private LocalDateTime homeTime;

    @ApiModelProperty("物品类型")
    @TableField("item_type")
    private String itemType;

    @ApiModelProperty("支付方式")
    @TableField("payment_type")
    private String paymentType;

    @ApiModelProperty("优惠方式")
    @TableField("discount_type")
    private String discountType;

    @ApiModelProperty("优惠金额")
    @TableField("discount_amount")
    private Float discountAmount;

    @ApiModelProperty("支付金额")
    @TableField("payment_amount")
    private Float paymentAmount;

    @ApiModelProperty("办理人")
    @TableField("transactor")
    private String transactor;

    @ApiModelProperty("备注")
    @TableField("memo")
    private String memo;


}
