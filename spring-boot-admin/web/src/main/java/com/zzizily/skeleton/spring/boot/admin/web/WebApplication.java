package com.zzizily.skeleton.spring.boot.admin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {

  @RequestMapping(value="/home")
  public String home(){
    return "test";
  }

  public static void main(String[] args) {
    SpringApplication.run(WebApplication.class, args);
  }
}
