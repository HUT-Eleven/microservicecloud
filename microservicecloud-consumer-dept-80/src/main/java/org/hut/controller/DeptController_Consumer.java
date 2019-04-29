package org.hut.controller;

import java.util.List;

import org.hut.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController_Consumer {

//	private static final String REST_URL_PREFIX = "http://localhost:8001/";
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/consumer/dept/{id}")
	public Dept get(@PathVariable("id")Long id) {
		System.out.println(id);
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/"+id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/depts")
	public List<Dept> list(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/depts", List.class);
	}
	
}