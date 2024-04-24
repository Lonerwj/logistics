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
@TableName("citys")
@ApiModel(value = "CitysEntity对象", description = "")
public class CitysEntity {

    @TableId(value = "cityId", type = IdType.AUTO)
    private Integer cityId;

    @TableField("provinceId")
    private Integer provinceId;

    @TableField("city_id")
    private String city_id;

    @TableField("cityName")
    private String cityName;


}
