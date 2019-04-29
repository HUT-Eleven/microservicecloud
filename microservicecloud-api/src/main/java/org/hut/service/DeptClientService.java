package org.hut.service;

import java.util.List;

import org.hut.pojo.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="http://MICROSERVICECLOUD-DEPT")
public interface DeptClientService {

	@GetMapping(value="/dept/{id}")
	public Dept get(@PathVariable("id")Long id);
	
	@GetMapping("/depts")
	public List<Dept> list();
}
