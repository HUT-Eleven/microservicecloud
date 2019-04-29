package org.hut.dao;

import java.util.List;

import org.hut.pojo.Dept;

public interface DeptDao {

	boolean addDept(Dept dept);				//添加员工
	Dept findById(Long id);					//查找员工By id
	List<Dept> findAll();					//查找所有员工
}
