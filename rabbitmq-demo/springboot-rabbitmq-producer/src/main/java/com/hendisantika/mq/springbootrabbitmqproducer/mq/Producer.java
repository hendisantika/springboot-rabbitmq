package com.hendisantika.mq.springbootrabbitmqproducer.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rabbitmq-producer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-23
 * Time: 06:29
 */
@Component
public class Producer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${hendi.rabbitmq.exchange}")
    private String exchange;

    @Value("${hendi.rabbitmq.routingkey}")
    private String routingKey;

    public void produceMsg(String msg) {
        amqpTemplate.convertAndSend(exchange, routingKey, msg);
        System.out.println("Send msg = " + msg);
    }
}