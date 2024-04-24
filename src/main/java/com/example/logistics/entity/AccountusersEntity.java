package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDate;
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
@TableName("accountusers")
@ApiModel(value = "AccountusersEntity对象", description = "")
public class AccountusersEntity {

    @TableId(value = "AccountUser", type = IdType.AUTO)
    private Long accountUser;

    @TableField("userId")
    private Long userId;

    @TableField("AccountBalance")
    private BigDecimal accountBalance;

    @TableField("createDate")
    private LocalDate createDate;


}
