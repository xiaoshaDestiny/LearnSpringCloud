package com.learn.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

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
	
	/**
	 * 用在配置文件中定义的随机算法，代替轮询算法，使得cunsumer调用provider的时候选择随机调用
	 */
	@Bean
	public IRule myRule() {
		//return new RoundRobinRule();//轮询 【默认】
		//return new RandomRule();//随机
		return new RetryRule();//重试，当某个服务宕机之后，尝试几次发现失败之后就不再轮询它
	}
	

}
