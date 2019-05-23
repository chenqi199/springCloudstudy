package com.chen.streamstudy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding({Sink.class, OrderCustomer.class, PorductCustomer.class})
public class MessageListener {
    Logger log = LoggerFactory.getLogger(MessageListener.class);

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        log.info("【*** 消息接收 ***】" + message.getPayload());
    }

    @StreamListener(OrderCustomer.INPUT_ORDER)
    public void inputOrder(Order order) {
        log.info("=====订单监听收到=====\n 订单编号：{}\n 订单类型：{}\n 订单数量：{}\n====订单处理完成=====",
                order.getOrderNum(), order.getType(), order.getNum());
    }

    @StreamListener(PorductCustomer.INPUT_PRODUCT_ADD)
    public void inputProduct(Message<String> message) {
        log.info("新增产品监听收到：" + message.getPayload());
    }


}



