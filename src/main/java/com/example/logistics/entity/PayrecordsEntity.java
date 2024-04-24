package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
@TableName("payrecords")
@ApiModel(value = "PayrecordsEntity对象", description = "")
public class PayrecordsEntity {

    @TableId(value = "payDate", type = IdType.AUTO)
    private LocalDateTime payDate;

    @TableField("accountId")
    private Long accountId;

    @TableField("orderId")
    private Long orderId;

    @TableField("payId")
    private Long payId;

    @TableField("payRAmount")
    private BigDecimal payRAmount;

    @TableField("payRMethod")
    private Integer payRMethod;

    @TableField("payRStatus")
    private Integer payRStatus;


}
