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
@TableName("invoices")
@ApiModel(value = "InvoicesEntity对象", description = "")
public class InvoicesEntity {

    @TableId(value = "InvoiceId", type = IdType.AUTO)
    private Long invoiceId;

    @TableField("InvoiceType")
    private String invoiceType;

    @TableField("InvoicerelatedID")
    private Long invoicerelatedID;

    @TableField("InvoiceAmount")
    private BigDecimal invoiceAmount;

    @TableField("InvoiceDate")
    private LocalDate invoiceDate;

    @TableField("`issuer`")
    private String issuer;

    @TableField("payee")
    private String payee;


}
