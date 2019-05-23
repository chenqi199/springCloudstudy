//package com.chen.streamstudy;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.cloud.stream.messaging.Sink;
//
//@SpringBootApplication
//@EnableBinding(Sink.class)
//public class ConsumerApp {
//    Logger log = LoggerFactory.getLogger(ConsumerApp.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(ConsumerApp.class, args);
//    }
//
//    @StreamListener(Sink.INPUT)
//    public void receive(Object payload) {
//       log.info("-----------------Received: " + payload);
//    }
//}
