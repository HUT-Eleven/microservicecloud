package org.hut.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {

	@Value("${spring.application.name}")
	private String applicationName;
	
	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaServers;
	
	@Value("${server.port}")
	private String port;
	
	/**
	 * 展示从Github上读取到的信息
	 */
	@GetMapping("/config")
	public String getGithubConfig() {
		String info = "applicationName:  " + applicationName + "***************"
					+ "eurekaServers:  " + eurekaServers + "***************"
					+ "port:  " + port;
		System.out.println(info);
		return info;
	}
}
