package com.learn.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 类表关系映射
 * 
 * Dept --> Mysql Table
 * @author xiaosha
 *
 */

@NoArgsConstructor			//空参数构造器
@AllArgsConstructor			//全参数构造器
@Data						//set() get() 方法
@Accessors(chain=true)		//链式访问风格
public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname)
	{
		super();
		this.dname = dname;
	}
	
}