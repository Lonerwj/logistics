package com.example.logistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("order_service")
@ApiModel(value = "OrderServiceEntity对象", description = "")
public class OrderServiceEntity {

    @TableId(value = "osId", type = IdType.AUTO)
    private Long osId;

    @TableField("orderId")
    private Long orderId;

    @TableField("serviceId")
    private Long serviceId;


}
