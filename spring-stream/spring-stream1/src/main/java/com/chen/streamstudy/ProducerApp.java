package com.chen.streamstudy;

import com.esotericsoftware.minlog.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@EnableBinding(Source.class)
public class ProducerApp implements CommandLineRunner {

    Logger log = LoggerFactory.getLogger(ProducerApp.class);

    public static void main(String[] args) {
        SpringApplication.run(ProducerApp.class, args);
    }

    @Autowired
    @Qualifier("output")
    MessageChannel output;

    @Override
    public void run(String... strings) {
        while (true) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 字符串类型发送MQ
            Log.info("----------------------hello world");
            output.send(MessageBuilder.withPayload("good good study ,day day up.").build());
        }
    }
}
