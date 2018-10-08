package com.squirrel.cloud.mqproduct;

import com.squirrel.cloud.mqproduct.mapper.OrderMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Date:2018/10/8
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */

@Component
public class RabbitOrderSender {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public  void sendOrder(){

//        rabbitTemplate.send();


    }








}
