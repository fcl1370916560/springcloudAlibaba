package com.pti.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  //只启动一个服务也需要这个注解，否则会报错
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
