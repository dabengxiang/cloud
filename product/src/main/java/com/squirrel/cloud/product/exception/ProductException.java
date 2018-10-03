package com.squirrel.cloud.product.exception;

import com.squirrel.cloud.product.enums.ResultEnum;

/**
 * Date:2018/10/3
 * Author:gyc
 * Desc:
 */
public class ProductException extends  RuntimeException {
    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
