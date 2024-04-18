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
 * @since 2024-04-18 23:13:03
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("site_point")
@ApiModel(value = "SitePointEntity对象", description = "")
public class SitePointEntity {

    @TableId(value = "site_id", type = IdType.AUTO)
    private Integer siteId;

    @TableField("site")
    private String site;

    @TableField("siteAddress")
    private String siteAddress;

    @TableField("principal")
    private String principal;

    @TableField("`password`")
    private String password;

    @TableField("`level`")
    private Integer level;


}
