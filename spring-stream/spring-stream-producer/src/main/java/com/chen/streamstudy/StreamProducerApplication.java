package com.chen.streamstudy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.util.Date;

/**
 * @author chen
 * @version 1.0.1
 * @time 2019/5/21 : 23:20
 * @mail chen_q_i@163.com
 */
@SpringBootApplication
@EnableBinding({Source.class, OrderProcessor.class, ProductProcessor.class})
public class StreamProducerApplication implements CommandLineRunner {
    Logger log = LoggerFactory.getLogger(StreamProducerApplication.class);

    @Autowired
    @Qualifier("output")
    MessageChannel output;

    @Autowired
    @Qualifier("outputOrder")
    MessageChannel outputOrder;

    @Autowired
    ProductProcessor productProcessor;


    public static void main(String[] args) {
        SpringApplication.run(StreamProducerApplication.class);
    }




    @Override
    public void run(String... strings) throws InterruptedException {
        while (true){
            // 字符串类型发送MQ
            log.info("\n-------------------------------字符串信息发送");
            output.send(MessageBuilder.withPayload("大家好").build());

            // 使用 定义的接口的方式来发送
            log.info("\n------------------------------新增产品发送");
            productProcessor.outputProductAdd().send(MessageBuilder.withPayload("添加一个产品").build());

            // 实体类型发送MQ
            log.info("\n------------------------------订单实体发送");
            Order appleOrder = new Order();
            appleOrder.setOrderNum("0000001");
            appleOrder.setNum(10);
            appleOrder.setType("APPLE");
            appleOrder.setCreateAt(new Date());
            // 使用 注入 MessageChannel 方式发送
            outputOrder.send(MessageBuilder.withPayload(appleOrder).build());
            Thread.sleep(3000);
        }
     
    }

//
//     定时轮询发送消息到 binding 为 Processor.OUTPUT
    @Bean
    @InboundChannelAdapter(value = Processor.OUTPUT, poller = @Poller(fixedDelay = "3000", maxMessagesPerPoll = "1"))
    public MessageSource<String> timerMessageSource() {
        return () -> MessageBuilder.withPayload("\n-----------------------------短消息-" + new Date()).build();
    }


}

