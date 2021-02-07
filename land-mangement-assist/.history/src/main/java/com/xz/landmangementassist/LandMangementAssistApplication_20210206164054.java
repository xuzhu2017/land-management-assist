package com.xz.landmangementassist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
public class LandMangementAssistApplication {

	public static void main(String[] args) {
		SpringApplication.run(LandMangementAssistApplication.class, args);
	}

}
