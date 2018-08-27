package com.zzizily.skeleton.spring.boot.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableKafka
@EnableScheduling //producer ?��?�� ?��?��
public class SpringBootKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaConsumerApplication.class, args);
	}
}
