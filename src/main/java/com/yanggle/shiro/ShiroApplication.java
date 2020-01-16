package com.yanggle.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = {"com.yanggle.shiro.dao"})
public class ShiroApplication {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(ShiroApplication.class, args);
    }
}
