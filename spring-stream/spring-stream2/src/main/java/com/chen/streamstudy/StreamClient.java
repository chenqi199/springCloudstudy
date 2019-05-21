//package com.chen.streamstudy;
//
//
//import org.springframework.cloud.stream.annotation.Input;
//import org.springframework.cloud.stream.annotation.Output;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.SubscribableChannel;
//
//public interface StreamClient {
//    @Input("testMessage")
//    SubscribableChannel input();  //用于接受消息
//
//    @Output("testMessage")
//    MessageChannel output();  //用于发送消息
//}
