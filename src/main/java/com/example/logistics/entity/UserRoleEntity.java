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
@TableName("user_role")
@ApiModel(value = "UserRoleEntity对象", description = "")
public class UserRoleEntity {

    @TableId(value = "upId", type = IdType.AUTO)
    private Long upId;

    @TableField("roleId")
    private Long roleId;

    @TableField("userId")
    private Long userId;


}
