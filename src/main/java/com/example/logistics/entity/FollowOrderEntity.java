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
@TableName("follow_order")
@ApiModel(value = "FollowOrderEntity对象", description = "")
public class FollowOrderEntity {

    @ApiModelProperty("id")
    @TableId(value = "follow_id", type = IdType.AUTO)
    private Integer followId;

    @ApiModelProperty("订单id")
    @TableField("order_id")
    private Integer orderId;

    @ApiModelProperty("外区分拣中心分配配送员")
    @TableField("point_principalid")
    private Integer pointPrincipalid;

    @ApiModelProperty("外区分拣中心地址")
    @TableField("point_address")
    private String pointAddress;

    @ApiModelProperty("到达网点时间")
    @TableField("point_time")
    private LocalDateTime pointTime;

    @ApiModelProperty("网点配送员")
    @TableField("topoint_deliverymanid")
    private Integer topointDeliverymanid;

    @ApiModelProperty("网点地址")
    @TableField("topoint_address")
    private String topointAddress;

    @ApiModelProperty("送货上门到达时间")
    @TableField("tohome_time")
    private String tohomeTime;


}
