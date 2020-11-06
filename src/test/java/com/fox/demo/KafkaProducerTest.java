package com.fox.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class KafkaProducerTest {


    @Autowired
    private KafkaProducer kafkaProducer;
    @Test
    void send() {
        kafkaProducer.send("我的测试");
    }
}