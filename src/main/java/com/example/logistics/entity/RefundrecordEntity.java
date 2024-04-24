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
@TableName("refundrecord")
@ApiModel(value = "RefundrecordEntity对象", description = "")
public class RefundrecordEntity {

    @TableId(value = "RefundRecordId", type = IdType.AUTO)
    private Long refundRecordId;

    @TableField("orderId")
    private Long orderId;

    @TableField("accountId")
    private Long accountId;

    @TableField("RefundRecordDate")
    private LocalDate refundRecordDate;

    @TableField("RefundRecordAmount")
    private BigDecimal refundRecordAmount;

    @TableField("RefundRecordReason")
    private String refundRecordReason;


}
