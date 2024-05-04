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
 * @author lonerW
 * @since 2024-04-25 15:41:16
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("cars")
@ApiModel(value = "CarsEntity对象", description = "")
public class CarsEntity {

    @TableId(value = "car_id", type = IdType.AUTO)
    private Long carId;

    @TableField("userId")
    private Long userId;

    @TableField("id_code")
    private String idCode;

    @ApiModelProperty("0：启用，1：禁用")
    @TableField("car_state")
    private Integer carState;

    @ApiModelProperty("0：未满载，1：满载")
    @TableField("load_state")
    private Integer loadState;

    @TableField("load_space")
    private Integer loadSpace;

    @TableField("load_num")
    private Integer loadNum;

    @ApiModelProperty("车辆位置")
    @TableField("location")
    private Integer location;

    @ApiModelProperty("定位")
    @TableField("position")
    private String position;


}
