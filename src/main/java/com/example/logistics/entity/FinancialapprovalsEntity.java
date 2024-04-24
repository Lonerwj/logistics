package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("financialapprovals")
@ApiModel(value = "FinancialapprovalsEntity对象", description = "")
public class FinancialapprovalsEntity {

    @TableId(value = "FinancialApprovalId", type = IdType.AUTO)
    private Long financialApprovalId;

    @TableField("accountId")
    private Long accountId;

    @TableField("Approver")
    private String approver;

    @TableField("ApprovalOPinion")
    private String approvalOPinion;

    @TableField("ApprovalStatus")
    private String approvalStatus;

    @TableField("ApprovalTime")
    private LocalDateTime approvalTime;


}
