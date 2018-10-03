package com.squirrel.cloud.product.service;


import com.squirrel.cloud.product.dataobject.ProductInfo;
import com.squirrel.cloud.product.dto.DecreaseStockInput;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-09 21:57
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    List<ProductInfo> findByProductIdIn(List<String> productList);

    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
