package com.learn.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springcloud.dao.DeptDao;
import com.learn.springcloud.entities.Dept;
import com.learn.springcloud.service.DeptService;
/**
 * Service层的实现层
 * @author xiaosha
 *
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	
	
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	public List<Dept> list() {
		return deptDao.findAll();
	}

}
