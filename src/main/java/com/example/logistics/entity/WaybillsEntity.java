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
 * @since 2024-04-24 23:24:42
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("waybills")
@ApiModel(value = "WaybillsEntity对象", description = "")
public class WaybillsEntity {

    @TableId(value = "waybillId", type = IdType.AUTO)
    private Long waybillId;

    @TableField("orderId")
    private Long orderId;

    @TableField("userId")
    private Long userId;

    @TableField("departure")
    private Long departure;

    @TableField("destination")
    private Long destination;

    @TableField("depTime")
    private LocalDateTime depTime;

    @TableField("destTime")
    private LocalDateTime destTime;


}
