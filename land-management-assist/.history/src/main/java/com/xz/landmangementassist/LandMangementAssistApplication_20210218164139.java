package com.xz.landmanagementassist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xz.landmanagementassist.repository.admin")
public class landmanagementassistApplication {

	public static void main(String[] args) {
		SpringApplication.run(landmanagementassistApplication.class, args);
	}

}
