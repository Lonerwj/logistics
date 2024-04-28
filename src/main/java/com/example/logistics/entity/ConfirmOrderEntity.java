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
@TableName("confirm_order")
@ApiModel(value = "ConfirmOrderEntity对象", description = "")
public class ConfirmOrderEntity {

    @ApiModelProperty("确认id")
    @TableId(value = "confirm_id", type = IdType.AUTO)
    private Integer confirmId;

    @TableField("trader_id")
    private Integer traderId;

    @ApiModelProperty("订单id")
    @TableField("order_id")
    private Integer orderId;

    @ApiModelProperty("确认收货时间")
    @TableField("confirm_time")
    private LocalDateTime confirmTime;

    @ApiModelProperty("反馈")
    @TableField("feedback")
    private String feedback;

    @ApiModelProperty("负责人")
    @TableField("principal")
    private String principal;


}
