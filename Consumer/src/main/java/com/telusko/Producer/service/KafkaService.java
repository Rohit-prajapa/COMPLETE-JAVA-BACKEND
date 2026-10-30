package com.telusko.Producer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.telusko.Producer.model.Course;

@Service
public class KafkaService {

    private String message;

    @KafkaListener(topics = "telusko", groupId = "telusko-group")
    public void consume(Course course) {

        message = course + " got the data from kafka";

        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }
}