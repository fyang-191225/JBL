package com.zz.jbl.api.config;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zz
 * @version 1.0
 * @date 2020/1/18 21:26
 */

@Configuration
public class FeignConfig {

    public int connectTime=10000;
    public int readTime=10000;
    @Bean
    public Request.Options createOP(){
        return new Request.Options(connectTime,readTime);
    }
    //Feign 的重试次数 默认重试5次
    @Bean
    public Retryer createR(){
        return new Retryer.Default(50,100,3);
    }
}
