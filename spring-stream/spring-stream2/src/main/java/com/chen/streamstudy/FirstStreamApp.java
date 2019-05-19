package com.chen.streamstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
//@EnableBinding(Sink.class)
public class FirstStreamApp {
    public static void main(String[] args) {
        SpringApplication.run(FirstStreamApp.class, args);
    }

//    @StreamListener(Sink.INPUT)
//    public void receive(Object payload) {
//        System.out.println("Received: " + payload);
//    }
}
