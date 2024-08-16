package com.spring.cloud.service;

import com.spring.cloud.entities.Order;


public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}