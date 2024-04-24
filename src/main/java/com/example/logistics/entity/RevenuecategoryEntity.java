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
 * @since 2024-04-24 23:29:16
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("revenuecategory")
@ApiModel(value = "RevenuecategoryEntity对象", description = "")
public class RevenuecategoryEntity {

    @TableId(value = "RevenueCategoryId", type = IdType.AUTO)
    private Long revenueCategoryId;

    @TableField("RevenueCategoryName")
    private String revenueCategoryName;

    @TableField("RevenueCategoryInfo")
    private String revenueCategoryInfo;


}
