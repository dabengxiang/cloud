package com.squirrel.cloud.mqcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.squirrel.cloud.mqcustomer.mapper")
public class MqCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqCustomerApplication.class, args);
	}


}
