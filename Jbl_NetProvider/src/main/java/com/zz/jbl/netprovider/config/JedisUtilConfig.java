package com.zz.jbl.netprovider.config;


import com.zz.jbl.utils.JedisUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zz
 * @version 1.0
 * @date 2019/12/30 19:58
 */

@Configuration
public class JedisUtilConfig {

    @Bean
    public JedisUtil createJU() {
        return  new JedisUtil();
    }
}
