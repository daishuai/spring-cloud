package com.daishuai.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author admin
 * @version 1.0.0
 * @description 用户微服务
 * @createTime 2022-10-23 11:48:23
 */
@EnableEurekaClient
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
