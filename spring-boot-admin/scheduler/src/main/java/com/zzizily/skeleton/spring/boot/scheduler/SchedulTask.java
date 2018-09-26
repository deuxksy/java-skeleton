package com.zzizily.skeleton.spring.boot.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class SchedulTask {
  private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

  private Map<String, String> map = new HashMap<>();

  @Scheduled(fixedRate = 1000)
  public void reportCurrentTime() {
    String key = dateFormat.format(new Date());
    log.info("The time is now {}", key);
    map.put(key,
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"+
      "미세: sun.net.www.MessageHeader@570186486 pairs: {null: HTTP/1.1 201}{X-Application-Context: application:9090}{Location: http://localhost:9090/10321be9}{Content-Type: application/json;charset=UTF-8}{Transfer-Encoding: chunked}{Date: Wed, 26 Sep 2018 08:09:29 GMT}"
    );
  }
}
