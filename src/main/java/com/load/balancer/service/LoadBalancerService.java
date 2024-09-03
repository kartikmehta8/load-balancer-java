package com.load.balancer.service;

import java.util.List;

public interface LoadBalancerService {
    String getServer(List<String> servers);
}
