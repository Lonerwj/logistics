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
@TableName("site_area")
@ApiModel(value = "SiteAreaEntity对象", description = "")
public class SiteAreaEntity {

    @ApiModelProperty("站点编号")
    @TableId(value = "site_id", type = IdType.AUTO)
    private Integer siteId;

    @ApiModelProperty("站点")
    @TableField("site")
    private String site;

    @ApiModelProperty("站点详细地址")
    @TableField("site_address")
    private String siteAddress;

    @ApiModelProperty("负责人")
    @TableField("principal")
    private String principal;

    @ApiModelProperty("密码")
    @TableField("`password`")
    private String password;

    @ApiModelProperty("级别（0：省级，1：市级，2：区级，3：快递站）")
    @TableField("`level`")
    private Integer level;


}
