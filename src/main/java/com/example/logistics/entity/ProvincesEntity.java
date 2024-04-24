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
@TableName("provinces")
@ApiModel(value = "ProvincesEntity对象", description = "")
public class ProvincesEntity {

    @TableId(value = "provinceId", type = IdType.AUTO)
    private Integer provinceId;

    @TableField("province_Id")
    private String province_id;

    @TableField("provinceName")
    private String provinceName;


}
