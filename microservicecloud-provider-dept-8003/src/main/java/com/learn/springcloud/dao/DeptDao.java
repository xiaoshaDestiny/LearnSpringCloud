package com.learn.springcloud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.learn.springcloud.entities.Dept;

/**
 * Dao层 使用MyBatis 一定不要忘记Mapper这个类
 * @author xiaosha
 *
 */

@Mapper
public interface DeptDao {
	
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();

}
