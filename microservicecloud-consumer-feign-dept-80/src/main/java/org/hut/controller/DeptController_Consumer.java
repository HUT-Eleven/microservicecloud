package org.hut.controller;

import java.util.List;

import org.hut.pojo.Dept;
import org.hut.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController_Consumer {

	@Autowired
	private DeptClientService deptClientService;
	
	@GetMapping(value="/consumer/dept/{id}")
	public Dept get(@PathVariable("id")Long id) {
		return deptClientService.get(id);
	}
	
	@GetMapping("/consumer/depts")
	public List<Dept> list(){
		return deptClientService.list();
	}
	
}