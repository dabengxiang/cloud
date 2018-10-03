package com.squirrel.cloud.product.feign;

import com.squirrel.cloud.product.dto.DecreaseStockInput;
import com.squirrel.cloud.product.dto.ProductInnerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Date:2018/10/3
 * Author:gyc
 * Desc:
 */

@FeignClient(name = "product",path ="/product")
public interface ProductFeign {

    @PostMapping("/feign/list")
    List<ProductInnerDto> listForOrder(@RequestBody List<String> productList);


    @PostMapping("/decrease/stock")
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
