package com.chen.streamstudy;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class MessageListener {
    @StreamListener("testMessage")
    public void input(Message<Company> message) {
        System.err.println("【*** 消息接收 ***】" + message.getPayload());
    }
}
