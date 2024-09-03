package com.load.balancer.config;

import com.load.balancer.service.RoundRobinLoadBalancer;
import com.load.balancer.service.IPHashLoadBalancer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalancerConfig {

    @Bean
    public RoundRobinLoadBalancer roundRobinLoadBalancer() {
        return new RoundRobinLoadBalancer();
    }

    @Bean
    public IPHashLoadBalancer ipHashLoadBalancer() {
        return new IPHashLoadBalancer();
    }
}
