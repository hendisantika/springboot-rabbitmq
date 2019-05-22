package com.hendisantika.mq.springbootrabbitmqproducer.controller;

import com.hendisantika.mq.springbootrabbitmqproducer.mq.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rabbitmq-producer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-23
 * Time: 06:30
 */
@RestController
public class WebController {

    @Autowired
    Producer producer;

    @RequestMapping("/send")
    public String sendMsg(@RequestParam("msg") String msg) {
        producer.produceMsg(msg);
        return "Done";
    }
}