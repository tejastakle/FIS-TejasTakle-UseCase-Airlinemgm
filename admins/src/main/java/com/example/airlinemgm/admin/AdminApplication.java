package com.example.airlinemgm.admin;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan("com.example.airlinemgm.model")
@EnableJpaRepositories("com.example.airlinemgm.repo")
@ComponentScan(basePackages="com.example")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(value="com.example.airlinemgm.serv")
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

}
