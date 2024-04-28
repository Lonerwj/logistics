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
@TableName("follow_order")
@ApiModel(value = "FollowOrderEntity对象", description = "")
public class FollowOrderEntity {

    @ApiModelProperty("id")
    @TableId(value = "follow_id", type = IdType.AUTO)
    private Integer followId;

    @ApiModelProperty("订单id")
    @TableField("order_id")
    private Integer orderId;

    @ApiModelProperty("所到分拣中心负责人")
    @TableField("point_principal_id")
    private Integer pointPrincipalId;

    @ApiModelProperty("所到分拣中心地址")
    @TableField("point_address")
    private String pointAddress;

    @ApiModelProperty("到达网点时间")
    @TableField("point_time")
    private LocalDateTime pointTime;

    @ApiModelProperty("下一网点配送员")
    @TableField("to_point_deliveryman_id")
    private Integer toPointDeliverymanId;

    @ApiModelProperty("下一网点地址")
    @TableField("to_point_address")
    private String toPointAddress;

    @ApiModelProperty("送货上门到达时间")
    @TableField("to_home_time")
    private LocalDateTime toHomeTime;

    @ApiModelProperty("运单状态(0:运输中，1已完成)")
    @TableField("state")
    private Integer state;

}
