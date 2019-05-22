package com.hendisantika.mq.springbootrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rabbitmq-consumer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-23
 * Time: 06:39
 */
@Component
public class Consumer {

    @RabbitListener(queues = "${hendi.rabbitmq.queue}")
    public void recievedMessage(String msg) {
        System.out.println("Received Message: " + msg);
    }
}