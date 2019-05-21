//package com.chen.streamstudy;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.messaging.Source;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.support.MessageBuilder;
//
//@SpringBootApplication
//@EnableBinding(Source.class)
//public class StreamProviderApplication implements CommandLineRunner {
//
//    @Autowired
//    @Qualifier("output")
//    MessageChannel output;
//
//    @Override
//    public void run(String... strings) throws Exception {
//        // 字符串类型发送MQ
//        while (true){
//            Thread.sleep(5000);
//            Company company = new Company();
//            company.setTitle("chen study");
//            company.setNote("good good  study day day up ");
//            output.send(MessageBuilder.withPayload(company.toString()).build());
//        }
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(StreamProviderApplication.class);
//    }
//
//}