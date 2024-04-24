package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
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
 * @since 2024-04-24 23:24:42
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("orders")
@ApiModel(value = "OrdersEntity对象", description = "")
public class OrdersEntity {

    @TableId(value = "orderId", type = IdType.AUTO)
    private Long orderId;

    @TableField("ord_orderId")
    private Long ordOrderid;

    @TableField("originAdd")
    private Long originAdd;

    @TableField("destAdd")
    private Long destAdd;

    @TableField("sendType")
    private Integer sendType;

    @TableField("receiveType")
    private Integer receiveType;

    @TableField("goodType")
    private Long goodType;

    @TableField("assurance")
    private Integer assurance;

    @TableField("collectTime")
    private LocalDateTime collectTime;

    @TableField("payType")
    private Integer payType;

    @TableField("payState")
    private Integer payState;

    @TableField("orderPath")
    private String orderPath;

    @TableField("orderPrice")
    private BigDecimal orderPrice;


}
