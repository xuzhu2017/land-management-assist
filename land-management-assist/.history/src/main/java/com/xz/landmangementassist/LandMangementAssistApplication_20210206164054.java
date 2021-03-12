package com.xz.landmanagementassist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public class landmanagementassistApplication {

	public static void main(String[] args) {
		SpringApplication.run(landmanagementassistApplication.class, args);
	}

}
