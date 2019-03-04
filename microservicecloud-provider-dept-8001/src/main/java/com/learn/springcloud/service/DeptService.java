package com.learn.springcloud.service;

import java.util.List;

import com.learn.springcloud.entities.Dept;
/**
 * Service层d的接口
 * @author xiaosha
 *
 */
public interface DeptService {
	
	public boolean add(Dept dept);
	public Dept get(Long id);
	public List<Dept> list();
	
}
