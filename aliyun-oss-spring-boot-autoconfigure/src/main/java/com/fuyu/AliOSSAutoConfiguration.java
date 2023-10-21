package com.fuyu;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AlIOSSProperties.class)
//自动配置类
public class AliOSSAutoConfiguration {

    @Bean
    public AliOSSUtils aliOSSUtils(AlIOSSProperties alIOSSProperties){
        AliOSSUtils aliOSSUtils = new AliOSSUtils();
        aliOSSUtils.setAlIOSSProperties(alIOSSProperties);
        return aliOSSUtils;
    }
}
