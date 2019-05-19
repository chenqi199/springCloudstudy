package com.chen.streamstudy;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;

public interface IMessageProvider {

    /**
     * 实现消息的发送，本次发送的消息是一个对象（自动变为json）
     * @param company VO对象，该对象不为null*/
    @Output("testMessage")
    public void send(Company company) ;
}

