package com.yp.consumerwebapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.yp.consumerserver" )
@ComponentScan(basePackages = "com.yp.**")
@MapperScan(basePackages = "com.yp.consumermapper.mapper")
public class ConsumerWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerWebappApplication.class, args);
	}
}
