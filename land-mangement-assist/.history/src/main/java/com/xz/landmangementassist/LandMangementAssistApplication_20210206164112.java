package com.xz.landmangementassist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xz.landmangementassist.repository.admin")
public class LandMangementAssistApplication {

	public static void main(String[] args) {
		SpringApplication.run(LandMangementAssistApplication.class, args);
	}

}
