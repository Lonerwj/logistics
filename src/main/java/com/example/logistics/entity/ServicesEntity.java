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
@TableName("services")
@ApiModel(value = "ServicesEntity对象", description = "")
public class ServicesEntity {

    @TableId(value = "serviceId", type = IdType.AUTO)
    private Long serviceId;

    @TableField("serviceName")
    private String serviceName;

    @TableField("serviceInfo")
    private String serviceInfo;

    @TableField("servicePrice")
    private BigDecimal servicePrice;


}
