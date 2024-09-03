package com.load.balancer.service;

import java.util.List;

public class IPHashLoadBalancer implements LoadBalancerService {

  @Override
  public String getServer(List<String> servers) {
    if (servers.isEmpty()) {
      throw new IllegalArgumentException("Server list is empty");
    }
    String clientIP = getClientIP();
    int hash = clientIP.hashCode();
    int serverIndex = Math.abs(hash) % servers.size();
    return servers.get(serverIndex);
  }

  private String getClientIP() {
    return "192.168.0.1";
  }
}
