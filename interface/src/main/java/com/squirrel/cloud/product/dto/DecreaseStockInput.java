package com.squirrel.cloud.product.dto;

import lombok.Data;

/**
 * Date:2018/10/3
 * Author:gyc
 * Desc:
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
