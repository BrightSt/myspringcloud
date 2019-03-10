package com.dms.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	/**
	 * ribbon提供了7中默认的规则 ，包含：轮询 随机  retry（服务好的时候与轮询一致，当存在有down掉的服务时，先轮询然后跳过down掉的服务）
	 * @return
	 */
//	@Bean
//	public IRule myRule() {
//		return new RetryRule();
//	}
}
