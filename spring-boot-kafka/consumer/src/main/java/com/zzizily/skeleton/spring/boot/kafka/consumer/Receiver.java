package com.zzizily.skeleton.spring.boot.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
/**
 * MQ 에서 데이터 읽어들이기
 */
@Slf4j
public class Receiver {

  private CountDownLatch latch = new CountDownLatch(1);

  public CountDownLatch getLatch() {
    return latch;
  }

  //groupId 정의시 subscribe 인식함
  @KafkaListener(groupId = "subscribe.a", topics = "${kafka.topic.boot}")
  public void receive1(ConsumerRecord<?, ?> consumerRecord) {
    log.info("[1st]:{},{},{},{},{},", consumerRecord.topic(), consumerRecord.partition(), consumerRecord.offset(), consumerRecord.key(), consumerRecord.value());
    latch.countDown();
  }

  @KafkaListener(groupId = "subscribe.b", topics = "${kafka.topic.boot}")
  public void receive2(ConsumerRecord<?, ?> consumerRecord) {
    log.info("[2rd]:{},{},{},{},{},", consumerRecord.topic(), consumerRecord.partition(), consumerRecord.offset(), consumerRecord.key(), consumerRecord.value());
    latch.countDown();
  }

//  @KafkaListener(groupId = "subscribe.c", topics = "${kafka.topic.boot}")
  public void receive3(ConsumerRecord<?, ?> consumerRecord) {
    log.info("[3rd]:{},{},{},{},{},", consumerRecord.topic(), consumerRecord.partition(), consumerRecord.offset(), consumerRecord.key(), consumerRecord.value());
    latch.countDown();
  }

//  @KafkaListener(groupId = "subscribe.d", topics = "${kafka.topic.boot}")
  public void receive4(ConsumerRecord<?, ?> consumerRecord) {
    log.info("[4rd]:{},{},{},{},{},", consumerRecord.topic(), consumerRecord.partition(), consumerRecord.offset(), consumerRecord.key(), consumerRecord.value());
    latch.countDown();
  }

}
