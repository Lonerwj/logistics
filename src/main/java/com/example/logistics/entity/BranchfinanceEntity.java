package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
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
@TableName("branchfinance")
@ApiModel(value = "BranchfinanceEntity对象", description = "")
public class BranchfinanceEntity {

    @TableId(value = "financeId", type = IdType.AUTO)
    private Long financeId;

    @TableField("branchId")
    private Long branchId;

    @TableField("financeType")
    private Integer financeType;

    @TableField("financeBalance")
    private BigDecimal financeBalance;

    @TableField("branch_everyday_count")
    private String branchEverydayCount;

    @TableField("financeRemark")
    private String financeRemark;

    @TableField("relatedorderId")
    private String relatedorderId;


}
