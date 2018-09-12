package com.kt.bigdata.bigmama.schdeuler.producer;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsMessagingTemplate;

import javax.jms.Queue;


@Configuration
public class ProducerConfig {

  @Bean
  public Queue queue() {
    return new ActiveMQQueue("mto.ndap");
  }
}