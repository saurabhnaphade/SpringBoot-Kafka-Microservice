package com.saurabh.WikimediaKafkaConsumer.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wikimedia_recentchange")
@Getter
@Setter
public class WikimediaData {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition="VARCHAR(10000)")
    private String wikiEventData;
}
