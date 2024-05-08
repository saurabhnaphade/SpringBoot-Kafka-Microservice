package com.saurabh.WikimediaKafkaConsumer.service;

import com.saurabh.WikimediaKafkaConsumer.entity.WikimediaData;
import com.saurabh.WikimediaKafkaConsumer.repository.WikimediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    @Autowired
    private WikimediaDataRepository wikimediaDataRepository;

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String eventMessage)
    {
        LOGGER.info(String.format("Event Message Received --> %s",eventMessage));

        WikimediaData data = new WikimediaData();
        data.setWikiEventData(eventMessage);

        wikimediaDataRepository.save(data);

    }

}
