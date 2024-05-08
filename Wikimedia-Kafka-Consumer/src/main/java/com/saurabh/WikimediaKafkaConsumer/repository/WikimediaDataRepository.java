package com.saurabh.WikimediaKafkaConsumer.repository;

import com.saurabh.WikimediaKafkaConsumer.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
