package org.hut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Config_Eureka_Server_App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Config_Eureka_Server_App.class, args);
	}

}
