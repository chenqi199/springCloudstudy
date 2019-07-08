package com.chen.eurakeStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chen
 * @version 1.0.1
 * @time 2019/6/11 : 23:09
 * @mail chen_q_i@163.com
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

//    @RequestMapping("/")
//    public String home() {
//        return "Hello world";
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
//        new SpringApplicationBuilder(Application.class).run(args);
    }

}