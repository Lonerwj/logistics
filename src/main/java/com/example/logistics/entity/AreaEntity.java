package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2024-05-04 18:46:14
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("area")
@ApiModel(value = "AreaEntity对象", description = "")
public class AreaEntity {

    @ApiModelProperty("主键")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("区县id")
    @TableField("area_id")
    private String areaId;

    @ApiModelProperty("区县名")
    @TableField("area")
    private String area;

    @ApiModelProperty("上级城市id")
    @TableField("father")
    private String father;


}
