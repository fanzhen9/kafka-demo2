package com.fox.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {


    @KafkaListener(topics = "myTopic",groupId = "gp-test-group")
    public void onMessage(String msg){
        System.out.println("-----收到消息："+msg+"-----");
    }
}
