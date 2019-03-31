package com.hfy.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hfy.example.dao")
public class MySpringboot190329Application {

	public static void main(String[] args) {
		SpringApplication.run(MySpringboot190329Application.class, args);
		System.out.println("启动完成！");
	}

}
