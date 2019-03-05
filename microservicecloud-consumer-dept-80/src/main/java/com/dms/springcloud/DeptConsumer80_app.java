package com.dms.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_app {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_app.class, args);
	}
}
