package com.zzizily.skeleton.spring.boot.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
/**
 * MQ에 데이터 저장
 */
public class Sender {

  static long seq = 0;

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  @Value("${kafka.topic.boot}")
  private String TOPIC_BOOT;

  //단순 5초마다 반복 @Scheduled 사용시 parameter 를 가지면 안됨
  @Scheduled(cron = "*/5 * * * * *")
  public void scheduled5() {
    this.send(TOPIC_BOOT, (seq++)+"_ksy_5");
  }

  //단순 7초마다 반복 @Scheduled 사용시 parameter 를 가지면 안됨
  @Scheduled(cron = "*/7 * * * * *")
  public void scheduled7() {
    this.send(TOPIC_BOOT, (seq++)+"_ksy_7");
  }

  public void send(String topic, String payload) {
    log.info("sending payload='{}' to topic='{}'", payload, topic);
//    ProducerRecord producerRecord = new ProducerRecord<>(topic, payload);
//    kafkaTemplate.send(producerRecord);
    kafkaTemplate.send(topic, payload);
  }
}
