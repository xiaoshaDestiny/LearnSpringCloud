package com.learn.springcloud.cfgbeans;

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
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
