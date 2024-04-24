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
@TableName("return_order")
@ApiModel(value = "ReturnOrderEntity对象", description = "")
public class ReturnOrderEntity {

    @ApiModelProperty("id")
    @TableId(value = "return_id", type = IdType.AUTO)
    private Integer returnId;

    @ApiModelProperty("用户id")
    @TableField("trader_id")
    private Integer traderId;

    @ApiModelProperty("订单id")
    @TableField("order_id")
    private Integer orderId;

    @ApiModelProperty("数量")
    @TableField("amount")
    private Integer amount;

    @ApiModelProperty("退货时间")
    @TableField("return_time")
    private LocalDateTime returnTime;

    @ApiModelProperty("处理人")
    @TableField("handleid")
    private Integer handleid;

    @ApiModelProperty("退货理由")
    @TableField("returnreason")
    private String returnreason;


}
