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
@TableName("role_permission")
@ApiModel(value = "RolePermissionEntity对象", description = "")
public class RolePermissionEntity {

    @TableId(value = "rpId", type = IdType.AUTO)
    private Long rpId;

    @TableField("roleId")
    private Long roleId;

    @TableField("perId")
    private Long perId;


}
