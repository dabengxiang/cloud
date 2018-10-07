package com.squirrel.cloud.order.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * Date:2018/10/4
 * Author:gyc
 * Desc:
 */

@ConfigurationProperties(prefix = "order")
@Configuration
@Data
@RefreshScope
public class OrderProperties {

    private String name;
    private String price;
}
