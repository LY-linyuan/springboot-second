package com.tang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @MapperScan("com.tang.mapper")
public class Springboot005MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot005MybatisApplication.class, args);
    }

}
