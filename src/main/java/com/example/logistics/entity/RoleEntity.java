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
@TableName("role")
@ApiModel(value = "RoleEntity对象", description = "")
public class RoleEntity {

    @TableId(value = "roleId", type = IdType.AUTO)
    private Long roleId;

    @TableField("roleName")
    private String roleName;

    @TableField("roleSn")
    private String roleSn;


}
