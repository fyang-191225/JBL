package com.zz.jbl.netprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zz
 * @version 1.0
 * @date 2020/1/18 21:10
 */

@SpringBootApplication
@EnableDiscoveryClient
public class NetProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NetProviderApplication.class, args);
    }
}
