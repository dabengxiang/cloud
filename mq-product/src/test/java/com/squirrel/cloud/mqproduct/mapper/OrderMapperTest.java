package com.squirrel.cloud.mqproduct.mapper;

import com.squirrel.cloud.mqproduct.MqProductApplicationTests;
import com.squirrel.cloud.mqproduct.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Date:2018/10/6
 * Author:gyc
 * Desc:
 */
@Slf4j
public class OrderMapperTest extends MqProductApplicationTests {


    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void selectById(){
        Order order = orderMapper.selectByPrimaryKey("1");
        log.info(order.toString());
    }

    @Test
    public void insert(){
        Order order = new Order();
        order.setId("222");
        order.setName("zhangsan");
        order.setMessageId("6666");
        orderMapper.insert(order);
    }

}