package com.learn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 启动类
 * @author xiaosha
 *
 */
@SpringBootApplication
@EnableEurekaClient  //本服务启动后会自动注册进入Erueka服务中，也就是说这是一个Eureka的客户端
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker
public class DeptProvider8001_Hystrix_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}
}
