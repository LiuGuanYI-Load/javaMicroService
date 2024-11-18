package com.hmall.cart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages="com.hmall.api.client")
@SpringBootApplication
@MapperScan("com.hmall.cart.mapper")
public class CartApllication {
    public static void main(String[] args) {
        SpringApplication.run(CartApllication.class, args);
    }
}
