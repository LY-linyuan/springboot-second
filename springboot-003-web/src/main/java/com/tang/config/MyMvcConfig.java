package com.tang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * @Author 临渊
 * @Date 2022-09-08 20:52
 */

// 如果我们要扩展springmvc 官方建议我们这样去做
// 全面扩展 springmvc  dispatchservlet
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    // public interface ViewResolver 实现了试图解析器接口的类  我们皆可以把它看做试图解析器
    /*@Bean
    public ViewResolver myViewResolver() {
        return new MyViewResolver();
    }

    // 自定义了一个试图解析器
    public static class MyViewResolver implements ViewResolver {
        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }*/



    // 视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/tang").setViewName("test");
    }
}
