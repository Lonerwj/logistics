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
 * @since 2024-04-24 23:24:41
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("accounts")
@ApiModel(value = "AccountsEntity对象", description = "")
public class AccountsEntity {

    @TableId(value = "accountId", type = IdType.AUTO)
    private Long accountId;

    @TableField("accountType")
    private String accountType;

    @TableField("Amount")
    private BigDecimal amount;

    @TableField("accountDate")
    private LocalDate accountDate;

    @TableField("accountInfo")
    private String accountInfo;


}
