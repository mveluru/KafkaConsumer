package com.brite.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class ConsumerService {


  @KafkaListener(topics = "producer-location",groupId ="kafka-consumer-group" )
  public void kafkalistener(String location){
      System.out.println(location);
  }

}
