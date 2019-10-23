package com.qianliu.structural.proxy;

import lombok.Data;

/**
 * 物品
 */
@Data
public class Order {
    private Object orderInfo;
    private Integer userId;
}
