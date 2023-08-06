package com.cydeo.order.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @KafkaListener(topics = "order")
    public void consumeMessage(String message){
        System.out.println("Massage consumed, order will bw created " + message);
    }
}
