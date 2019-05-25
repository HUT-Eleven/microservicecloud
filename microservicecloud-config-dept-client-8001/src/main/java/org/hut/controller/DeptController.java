package org.hut.controller;

import java.util.List;

import org.hut.pojo.Dept;
import org.hut.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@GetMapping(value="/dept/{id}")
	public Dept get(@PathVariable("id")Long id) {
		return deptService.get(id);
	}
	
	@GetMapping("/depts")
	public List<Dept> list(){
		return deptService.list();
	}
}
