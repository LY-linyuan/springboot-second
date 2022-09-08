package com.tang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication  标注这个类时一个springboot应用  :  启动类下的所有资源被导入
@SpringBootApplication
public class Springboot001HelloworldApplication {

    public static void main(String[] args) {
        // 将springboot应用启动
        // SpringApplication类
        // run 方法
        SpringApplication.run(Springboot001HelloworldApplication.class, args);
    }

}
