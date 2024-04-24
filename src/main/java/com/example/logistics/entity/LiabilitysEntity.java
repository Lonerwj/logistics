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
@TableName("liabilitys")
@ApiModel(value = "LiabilitysEntity对象", description = "")
public class LiabilitysEntity {

    @TableId(value = "LiabilityId", type = IdType.AUTO)
    private Long liabilityId;

    @TableField("LiabilityName")
    private String liabilityName;

    @TableField("LiabilityType")
    private String liabilityType;

    @TableField("LiabilityAmount")
    private BigDecimal liabilityAmount;

    @TableField("Creditor")
    private String creditor;

    @TableField("DDueDate")
    private LocalDate dDueDate;

    @TableField("LiabilityInfo")
    private String liabilityInfo;


}
