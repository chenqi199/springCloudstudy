package com.chen.streamstudy;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author chen
 * @version 1.0.1
 * @time 2019/5/22 : 0:11
 * @mail chen_q_i@163.com
 */
public interface OrderProcessor {


    String OUTPUT_ORDER = "outputOrder";

    @Output(OUTPUT_ORDER)
    MessageChannel outputOrder();
}
