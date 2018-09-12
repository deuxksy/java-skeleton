package com.zzizily.skeleton.spring.boot.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SessionWebApplication extends  SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SessionWebApplication.class, args);
    }
}
