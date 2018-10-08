package com.squirrel.cloud.mqproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.squirrel.cloud.mqproduct.mapper")
public class MqProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqProductApplication.class, args);
	}
}
