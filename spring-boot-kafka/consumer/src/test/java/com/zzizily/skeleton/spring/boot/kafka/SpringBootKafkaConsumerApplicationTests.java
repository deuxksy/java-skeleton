package com.zzizily.skeleton.spring.boot.kafka;

import static org.assertj.core.api.Assertions.assertThat;
import com.zzizily.skeleton.spring.boot.kafka.consumer.Receiver;
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
public class SpringBootKafkaConsumerApplicationTests {

    private static String BOOT_TOPIC = "boot.t";
    @ClassRule
    public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, BOOT_TOPIC);

    @Autowired
    private Receiver receiver;

    @Test
    public void testReceive() throws Exception {
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    }

}
