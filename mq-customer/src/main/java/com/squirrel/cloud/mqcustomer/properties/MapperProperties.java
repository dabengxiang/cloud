package com.squirrel.cloud.mqcustomer.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import tk.mybatis.mapper.entity.Config;

/**
 * Date:2018/10/6
 * Author:gyc
 * Desc:
 */
@ConfigurationProperties(
        prefix = "mapper"
)
public class MapperProperties extends Config {
}
