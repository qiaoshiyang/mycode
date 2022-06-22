package com.work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * es 启动类
 *
 * shiYang
 * 2022/6/22 22:07
 * VERSION:1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class EsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EsApplication.class, args);
    }
}
