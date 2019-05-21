//package com.chen.streamstudy;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import javax.annotation.Resource;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = StreamProviderApplication.class)
//@WebAppConfiguration
//public class StreamstudyApplicationTests {
//
//    @Resource
//    private IMessageProvider messageProvider;
//
//    @Test
//    public void contextLoads() throws InterruptedException {
//        Company company = new Company();
//        company.setTitle("stream study");
//        company.setNote("this is stream study");
//        while (true){
//            Thread.sleep(3000);
//            this.messageProvider.send(company); // 消息发送
//        }
//    }
//
//}
