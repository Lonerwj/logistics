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
@TableName("transactionrecords")
@ApiModel(value = "TransactionrecordsEntity对象", description = "")
public class TransactionrecordsEntity {

    @TableId(value = "TransactionRecordId", type = IdType.AUTO)
    private Long transactionRecordId;

    @TableField("AccountUser")
    private Long accountUser;

    @TableField("TransactionRecordType")
    private String transactionRecordType;

    @TableField("TransactionRecordAmount")
    private BigDecimal transactionRecordAmount;

    @TableField("TransactionRecordDate")
    private LocalDate transactionRecordDate;

    @TableField("TransactionRecordInfo")
    private String transactionRecordInfo;


}
