package com.uow;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.uow.dao")
public class DigitalFlight {
	
	

	public static void main(String[] args) {
		System.out.println("System Start...");
		SpringApplication.run(DigitalFlight.class, args);
	}

}
