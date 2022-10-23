package com.daishuai.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author admin
 * @version 1.0.0
 * @description 部门微服务
 * @createTime 2022-10-23 11:43:46
 */
@EnableEurekaClient
@SpringBootApplication
public class DeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptApplication.class, args);
    }
}
