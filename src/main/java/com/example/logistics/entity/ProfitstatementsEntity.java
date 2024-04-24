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
@TableName("profitstatements")
@ApiModel(value = "ProfitstatementsEntity对象", description = "")
public class ProfitstatementsEntity {

    @TableField("ProfitStatementDate")
    private LocalDate profitStatementDate;

    @TableField("OperatingReceive")
    private BigDecimal operatingReceive;

    @TableField("OperatingCost")
    private BigDecimal operatingCost;

    @TableField("OperatingProfit")
    private BigDecimal operatingProfit;

    @TableField("ProfitBeforeTax")
    private BigDecimal profitBeforeTax;

    @TableField("ProfitAfterTax")
    private BigDecimal profitAfterTax;

    @TableId(value = "ProfitStatementId", type = IdType.AUTO)
    private Long profitStatementId;


}
