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
 * @since 2024-05-04 18:46:14
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("province")
@ApiModel(value = "ProvinceEntity对象", description = "")
public class ProvinceEntity {

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("省id")
    @TableField("province_id")
    private String provinceId;

    @ApiModelProperty("省名")
    @TableField("province")
    private String province;


}
