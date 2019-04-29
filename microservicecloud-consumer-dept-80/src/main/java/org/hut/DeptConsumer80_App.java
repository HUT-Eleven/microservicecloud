package org.hut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
