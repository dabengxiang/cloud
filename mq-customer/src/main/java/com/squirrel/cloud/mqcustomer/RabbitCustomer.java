package com.squirrel.cloud.mqcustomer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Date:2018/10/8
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */

@Component
@RabbitListener(queues = "hello")
public class RabbitCustomer {

    @RabbitHandler
    public void  process(String hello){
        System.out.println(hello);
    }
}
