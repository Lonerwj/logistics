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
@TableName("branchs")
@ApiModel(value = "BranchsEntity对象", description = "")
public class BranchsEntity {

    @TableId(value = "branchId", type = IdType.AUTO)
    private Long branchId;

    @TableField("areaId")
    private Integer areaId;

    @TableField("branchName")
    private String branchName;

    @TableField("branchType")
    private String branchType;

    @TableField("remark")
    private String remark;

    @TableField("branchAdd")
    private String branchAdd;


}
