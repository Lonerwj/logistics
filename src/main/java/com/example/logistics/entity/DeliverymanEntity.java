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
 * @since 2024-04-24 21:49:24
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("deliveryman")
@ApiModel(value = "DeliverymanEntity对象", description = "")
public class DeliverymanEntity {

    @ApiModelProperty("配送员Id")
    @TableId(value = "deliveryman_id", type = IdType.AUTO)
    private Integer deliverymanId;

    @ApiModelProperty("配送员密码")
    @TableField("`password`")
    private String password;

    @ApiModelProperty("配送员姓名")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("配送员年龄")
    @TableField("age")
    private Integer age;

    @ApiModelProperty("配送员所在站点")
    @TableField("site_id")
    private Integer siteId;

    @ApiModelProperty("配送员级别")
    @TableField("`level`")
    private String level;

    @ApiModelProperty("配送员联系方式")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("备注")
    @TableField("memo")
    private String memo;


}
