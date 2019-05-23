package com.chen.streamstudy;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author chen
 * @version 1.0.1
 * @time 2019/5/23 : 20:58
 * @mail chen_q_i@163.com
 */
public interface PorductCustomer {

    String INPUT_PRODUCT_ADD = "inputProductAdd";

    @Input(INPUT_PRODUCT_ADD)
    SubscribableChannel inputProductAdd();

}
