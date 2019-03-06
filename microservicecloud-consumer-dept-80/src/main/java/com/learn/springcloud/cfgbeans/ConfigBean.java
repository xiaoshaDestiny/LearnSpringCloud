package com.learn.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 新东西 RestTemplate
 * @author xiaosha
 *
 */
@Configuration
public class ConfigBean {
	
	/**
	 * 用RestTemplate来完成接口调用
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
