package org.hut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages= {"org.hut.dao"})
@EnableEurekaClient
public class DeptProvider8001_App {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptProvider8001_App.class, args);
	}
}
