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
@TableName("balancesheets")
@ApiModel(value = "BalancesheetsEntity对象", description = "")
public class BalancesheetsEntity {

    @TableField("BalanceSheetDate")
    private LocalDate balanceSheetDate;

    @TableField("TotalAssets")
    private BigDecimal totalAssets;

    @TableField("TotalLiabilities")
    private BigDecimal totalLiabilities;

    @TableField("OwnerEquity")
    private BigDecimal ownerEquity;

    @TableId(value = "BalanceSheetId", type = IdType.AUTO)
    private Long balanceSheetId;


}
