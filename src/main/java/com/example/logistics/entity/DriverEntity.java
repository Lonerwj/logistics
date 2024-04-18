package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
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
 * @author  My-way
 * @since 2024-04-18 23:09:21
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("driver")
@ApiModel(value = "DriverEntity对象", description = "")
public class DriverEntity {

    @ApiModelProperty("司机id")
    @TableId(value = "driver_id", type = IdType.AUTO)
    private Integer driverId;

    @ApiModelProperty("司机姓名")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("联系电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("入职时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("所属网点名")
    @TableField("website_name")
    private String websiteName;

    @ApiModelProperty("身份证号")
    @TableField("id_card")
    private String idCard;

    @ApiModelProperty("网点id")
    @TableField("website_id")
    private Integer websiteId;


}
