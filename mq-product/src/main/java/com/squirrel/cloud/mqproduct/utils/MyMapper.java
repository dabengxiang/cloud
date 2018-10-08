package com.squirrel.cloud.mqproduct.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Date:2018/10/6
 * Author:gyc
 * Desc:
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
