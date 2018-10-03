package com.squirrel.cloud.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date:2018/10/2
 * Author:gyc
 * Desc:
 */
@RestController
@RequestMapping("/product")
public class RestServerTestController {


    @GetMapping("/msg")
    public String msg(){
        return "this product msg";
    }

}
