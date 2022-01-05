package com.springkafka.kafkaProducer.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

//    @KafkaListener(topics = "topic_kafka_ujicoba", groupId = "group_id")
//    public void consumeMessage(String message) throws IOException {
//        logger.info("Consume Message -> {}", message);
//    }

    @KafkaListener(topics = "${topic.topicConsumer}", groupId = "group_id")
    public void consumeMessage(String message) throws IOException {
        logger.info("Consume Message -> {}", message);
    }
}
