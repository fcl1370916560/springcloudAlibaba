package cpm.pti.springcloud.alibaba.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced()
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * 配置负载均衡策略
     * RandomRule随机策略
     * RoundRobinRule轮询策略
     * BestAvailableRule最少并发数策略
     * @return
     */
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }

}
