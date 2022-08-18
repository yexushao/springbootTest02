package com.example.springboottest.control;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class test02 {
    @Bean
    public ServletRegistrationBean registrationBean(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new test03(),"/test03");
        return registrationBean;
    }
}
