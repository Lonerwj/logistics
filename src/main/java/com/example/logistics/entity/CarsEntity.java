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
 * @since 2024-04-24 23:24:42
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

    @TableField("car_state")
    private Integer carState;

    @TableField("load_state")
    private Integer loadState;

    @TableField("load_space")
    private Integer loadSpace;

    @TableField("load_num")
    private Integer loadNum;


}
