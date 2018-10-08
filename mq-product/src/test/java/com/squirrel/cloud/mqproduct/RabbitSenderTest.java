package com.squirrel.cloud.mqproduct;

import org.junit.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Date:2018/10/8
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
public class RabbitSenderTest extends  MqProductApplicationTests {


    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Test
    public void queueSend(){
        rabbitTemplate.convertAndSend("hello","abc");
    }
}
