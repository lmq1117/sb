package com.sam.sb.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // super.configure(http);
        //表单提交
        http.formLogin()
                //自定义登录页面
                .loginPage("/login.html")
                //当发现是/login的时候 认为是登录 必须与表单提交target一样
                .loginProcessingUrl("/login")
                //登录成功后跳转页面 必须是post请求
                .successForwardUrl("/toMain")
                .failureForwardUrl("/toError")
                //别名 与登录表单要对应上
                .usernameParameter("username123")
                //别名 与登录表单要对应上
                .passwordParameter("password123")

        ;
        //授权认证
        http.authorizeRequests()
                // /login.html 不需要被认证
                .antMatchers("/login.html").permitAll()
                // /error.html不需要被认证
                .antMatchers("/error.html").permitAll()
                //所有请求都必须被认证 必须登录后才可以被访问
                .anyRequest().authenticated()
        ;
        http.csrf().disable();
    }

    @Bean
    public PasswordEncoder getPw() {
        return new BCryptPasswordEncoder();
    }


}
