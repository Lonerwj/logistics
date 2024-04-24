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
@TableName("areas")
@ApiModel(value = "AreasEntity对象", description = "")
public class AreasEntity {

    @TableId(value = "areaId", type = IdType.AUTO)
    private Integer areaId;

    @TableField("cityId")
    private Integer cityId;

    @TableField("area_id")
    private String area_id;

    @TableField("areaName")
    private String areaName;


}
