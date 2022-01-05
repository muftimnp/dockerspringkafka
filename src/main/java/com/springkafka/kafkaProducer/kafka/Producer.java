package com.springkafka.kafkaProducer.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    private static final String TOPIC = "topic_kafka_ujicoba";

    @Value("${topic.topicProducer}")
    private String myTopicKafka;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        logger.info("Message -> {}", message);
        logger.info("myTopicKafka -> {}", myTopicKafka);
        this.kafkaTemplate.send(TOPIC, message);
//        this.kafkaTemplate.send(myTopicKafka, message);
    }
}
