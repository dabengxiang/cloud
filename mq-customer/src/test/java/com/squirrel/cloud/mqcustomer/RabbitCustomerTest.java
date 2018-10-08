package com.squirrel.cloud.mqcustomer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Date:2018/10/8
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
public class RabbitCustomerTest extends  MqCustomerApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;


}
