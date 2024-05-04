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
@TableName("branch")
@ApiModel(value = "BranchEntity对象", description = "")
public class BranchEntity {

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("网点名称")
    @TableField("`name`")
    private String name;

    @ApiModelProperty("网点县级地址id")
    @TableField("addr_id")
    private String addrId;

    @ApiModelProperty("网点县级名称")
    @TableField("addr_name")
    private String addrName;

    @ApiModelProperty("网点类型，0：普通网点，1，市级转运网点，2：省级转运网点")
    @TableField("`type`")
    private String type;

    @ApiModelProperty("备注，可扩展，添加其他信息例如电话")
    @TableField("remark")
    private String remark;

    @TableField("site_address")
    private String siteAddress;

    @TableField("principal_id")
    private Integer principalId;

    @TableField("principal")
    private String principal;

    @TableField("`password`")
    private String password;


}
