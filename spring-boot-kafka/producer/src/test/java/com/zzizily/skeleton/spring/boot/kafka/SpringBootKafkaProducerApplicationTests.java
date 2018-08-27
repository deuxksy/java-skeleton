package com.zzizily.skeleton.spring.boot.kafka;

import static org.assertj.core.api.Assertions.assertThat;
import com.zzizily.skeleton.spring.boot.kafka.producer.Sender;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.rule.KafkaEmbedded;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
/**
 * 테스트는 꼭필요 한되 습관이 안됨
 */
public class SpringBootKafkaProducerApplicationTests {

	private static String BOOT_TOPIC = "boot.t";
	@ClassRule
	public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, BOOT_TOPIC);
	@Autowired
	private Sender sender;

	@Test
	public void testReceive() throws Exception {
		sender.send(BOOT_TOPIC, "Hello Boot!");
	}

}
