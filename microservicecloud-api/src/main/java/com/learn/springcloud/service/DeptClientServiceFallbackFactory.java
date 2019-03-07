package com.learn.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.learn.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;


@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{
	
	public DeptClientService create(Throwable throwable){
		return new DeptClientService() {
			
			public Dept get(long id){
				return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
						.setDb_source("no this database in MySQL");
			}
			
			public List<Dept> list(){
				List<Dept> errinfo = new ArrayList<Dept>();
				errinfo.add(new Dept().setDeptno((long) 1).setDname("没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
						.setDb_source("no this database in MySQL"));
				return errinfo;
			}
			
			public boolean add(Dept dept){
				return false;
			}
		};
	}
}

