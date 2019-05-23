package com.chen.streamstudy;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author chen
 * @version 1.0.1
 * @time 2019/5/23 : 20:57
 * @mail chen_q_i@163.com
 */
public interface OrderCustomer {
    String INPUT_ORDER = "inputOrder";

    @Input(INPUT_ORDER)
    SubscribableChannel inputOrder();
}
