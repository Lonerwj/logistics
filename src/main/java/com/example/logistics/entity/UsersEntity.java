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
@TableName("users")
@ApiModel(value = "UsersEntity对象", description = "")
public class UsersEntity {

    @TableId(value = "userId", type = IdType.AUTO)
    private Long userId;

    @TableField("car_id")
    private Long carId;

    @TableField("userName")
    private String userName;

    @TableField("userPassword")
    private String userPassword;

    @TableField("userTel")
    private String userTel;

    @TableField("userEmail")
    private String userEmail;

    @TableField("userAge")
    private Integer userAge;

    @TableField("certification")
    private Integer certification;

    @TableField("nickName")
    private String nickName;


}
