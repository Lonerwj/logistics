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
 * @author  My-way
 * @since 2024-04-18 23:09:21
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("car")
@ApiModel(value = "CarEntity对象", description = "")
public class CarEntity {

    @ApiModelProperty("车辆id")
    @TableId(value = "car_id", type = IdType.AUTO)
    private Integer carId;

    @ApiModelProperty("司机id")
    @TableField("driver_id")
    private Integer driverId;

    @ApiModelProperty("车牌号")
    @TableField("id_code")
    private String idCode;

    @ApiModelProperty("车最大载量")
    @TableField("load_space")
    private Integer loadSpace;

    @ApiModelProperty("车辆状态（0：启用，1：禁用）")
    @TableField("state")
    private Integer state;

    @ApiModelProperty("满载情况（0：未满载，1：满载）")
    @TableField("load_state")
    private Integer loadState;

    @ApiModelProperty("当前装载数量")
    @TableField("load_num")
    private Integer loadNum;


}
