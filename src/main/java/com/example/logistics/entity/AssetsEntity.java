package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
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
@TableName("assets")
@ApiModel(value = "AssetsEntity对象", description = "")
public class AssetsEntity {

    @TableId(value = "AssetsId", type = IdType.AUTO)
    private Long assetsId;

    @TableField("AssetsName")
    private String assetsName;

    @TableField("AssetType")
    private String assetType;

    @TableField("AssetAmount")
    private BigDecimal assetAmount;

    @TableField("AssetInfo")
    private String assetInfo;

    @TableField("AssetsOwner")
    private String assetsOwner;


}
