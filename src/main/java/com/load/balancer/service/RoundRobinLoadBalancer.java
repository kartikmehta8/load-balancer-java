package com.load.balancer.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobinLoadBalancer implements LoadBalancerService {

  private AtomicInteger position = new AtomicInteger(0);

  @Override
  public String getServer(List<String> servers) {
    if (servers.isEmpty()) {
      throw new IllegalArgumentException("Server list is empty");
    }
    int pos = Math.abs(position.getAndIncrement()) % servers.size();
    return servers.get(pos);
  }
}
