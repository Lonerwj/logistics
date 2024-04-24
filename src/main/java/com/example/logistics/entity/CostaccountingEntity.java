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
@TableName("costaccounting")
@ApiModel(value = "CostaccountingEntity对象", description = "")
public class CostaccountingEntity {

    @TableId(value = "CostAccountingId", type = IdType.AUTO)
    private Long costAccountingId;

    @TableField("ExpenseItem")
    private String expenseItem;

    @TableField("CostAccountingAmount")
    private BigDecimal costAccountingAmount;

    @TableField("CostAccountingDate")
    private LocalDate costAccountingDate;

    @TableField("CostAccountingInfo")
    private String costAccountingInfo;

    @TableField("CostAccountingType")
    private String costAccountingType;


}
