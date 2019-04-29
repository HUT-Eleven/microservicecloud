package org.hut.service;

import java.util.List;

import org.hut.pojo.Dept;

public interface DeptService {

	boolean add(Dept dept);				
	Dept get(Long id);					
	List<Dept> list();
}
