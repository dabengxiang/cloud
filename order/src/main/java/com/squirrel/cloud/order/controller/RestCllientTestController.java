package com.squirrel.cloud.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Date:2018/10/2
 * Author:gyc
 * Desc:
 */

@RestController
@Slf4j
@RequestMapping("/order")
public class RestCllientTestController {


    @Autowired
    private LoadBalancerClient client;


    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/productMsg")
    public Object getProductMsg(){
        //第一种方法
//        RestTemplate restTemplate = new RestTemplate();
//        String forObject = restTemplate.getForObject("http://localhost:6062/product/msg", String.class);
//        return forObject;


        ServiceInstance product = client.choose("product");
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("http://%s:%s", product.getHost(), product.getPort())+"/product/msg";
        String forObject = restTemplate.getForObject(url, String.class);



        //第三种方法
//        String forObject = restTemplate.getForObject("http://product/product/msg", String.class);


        return forObject;
    }
}
