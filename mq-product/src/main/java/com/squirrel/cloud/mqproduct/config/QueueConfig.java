package com.squirrel.cloud.mqproduct.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Date:2018/10/8
 * Author: yc.guo the one whom in nengxun
 * Desc:
 */
@Configuration
public class QueueConfig {

    @Bean
    public Queue queue(){
        return new Queue("hello");
    }

}
