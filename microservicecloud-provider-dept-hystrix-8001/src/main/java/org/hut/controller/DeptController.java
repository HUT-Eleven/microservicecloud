package org.hut.controller;

import java.util.List;

import org.hut.pojo.Dept;
import org.hut.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@GetMapping(value = "/dept/{id}")
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = deptService.get(id);
		if (null == dept) {
			throw new RuntimeException();
		}
		return deptService.get(id);
	}

	public Dept processHystrix_Get(@PathVariable("id") Long id) {
		return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
				.setDbSource("no this database in MySQL");
	}

	@GetMapping("/depts")
	public List<Dept> list() {
		return deptService.list();
	}
}
