package org.hut.service.impl;

import java.util.List;

import org.hut.dao.DeptDao;
import org.hut.pojo.Dept;
import org.hut.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	public DeptDao deptDao;
	
	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}

}
