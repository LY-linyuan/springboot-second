package com.tang.config;

import org.springframework.context.ApplicationContext;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author 临渊
 * @Date 2022-09-09 14:55
 */

// AOP : 拦截器!
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // 链式编程
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 首页所有人可以访问 功能页 左右对应有权限的人才能访问
        // 请求授权的规则
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/level1/*").hasRole("vip1")
                .antMatchers("/level2/*").hasRole("vip2")
                .antMatchers("/level3/*").hasRole("vip3");
        // 没有权限默认跳到登录页面 , 需要开启登录的页面
        http.formLogin();
        // 开启了注销功能  跳到首页
        http.logout().logoutSuccessUrl("/");
        // 开启记住我功能 cookie 默认保存两周
        http.rememberMe();

    }

    // 认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // 这些数据正常从数据库读取
        // 密码没被加密
        // 在Spring Security 5.0+ 新增了很多加密方法
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("T").password(new BCryptPasswordEncoder().encode("516")).roles("vip2", "vip3")
                .and()
                .withUser("rootT").password(new BCryptPasswordEncoder().encode("0516")).roles("vip1", "vip2", "vip3")
                .and()
                .withUser("guest").password(new BCryptPasswordEncoder().encode("00516")).roles("vip1");
    }
}
