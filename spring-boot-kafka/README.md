Spring Boot with Kafka
=
# 1. Software Architecture
* Spring Boot 1.5.x
  * Spring Framework 4.3.x
  * Spring Kafka 1.3.x
  * Spring Integration 2.3.x
* Apache Kafka 1.0.x
  * Kafka Client 1.0.x

# 2. 사용이유

## 2.1 ActiveMQ vs RabbitMQ vs Kafka

### 2.1.1 RabbitMQ 
* 장점
  * 단점이 너무 커서 단순 테스트만 하고 상세하게 기능 확인 안함
* 단점
  * Erlang 에 대한 Dependence 가 있음 RabbitMQ 필수로 사용 해야 하는 이유가 없으면 사용안함
    * 폐쇄망 프로젝트 사용을 해야 함에 따른 기술에 대한 Dependence 최소화 를 통한 운영에 대한 부담 줄여야 함
    * 개발후 솔루션화에 따른 아키텍처에 대한 간결 추구
### 2.1.2 ActiveMQ
* 장점
  * JMS 지원 
  * Dependence 없음
  * Spring Boot Autoconfiguration
    * RabbitMQ, Kafka 도 다 지원 하니깐 딱히 장점은 아님
  * 학습이 용이함
    * Virtual Topic 에 대한 부분 말고는 MQ 솔루션 에 대한 공통 개념
  * Virtual Topic 사용에 따른 Topic 데이터 분실 할일 없음
    * Kafka 에도 있음 당연히 RabbitMQ 도 있을거 같음
  * ActiveMQ 에 대한 좋은글 나중에 시간 나면 번역 해보고 싶다
    * https://tuhrig.de/queues-vs-topics-vs-virtual-topics-in-activemq/
    * https://tuhrig.de/virtual-topics-in-activemq/
* 단점
  * Virtual Topic 를 사용 하더라도 신규 Subscribe 에는 데이터를 받을수 없음 (못찾은 건가?)
  * 성능이 Kafka 보다 떨어짐
  * Kafka 보다 좀 없어 보임 (답정너 ㅋㅋㅋ)

### 2.1.3 Kafka
Queue 와 Topic 에 대한 차이는 없음 ActiveMQ 는 Queue 는 1:1, Topic 는 1:N 개념 하지만 Kafka 는 그냥 다 Topic

* 장점
  * Zookeeper 기본 탑제 하여서 분산을 기본으로 설계됨 심지어 Quick Start 초반에 분산 예제가 나옴
  * Batch 단위로 데이터 처리시 성능이 좋음
  * 다른 MQ 솔루션과 다르게 MQ 에 대한 복잡성 낮음 Queue, Topic 같은 구조
  * Producer 와 Consumer, Publish 와 Subscribe 두개의 구조가 Source 상의 차이는 없음(현제 테스트 하기로는)  
  * 데이터가 디스크에 기록됨 데이터 안전함
    * Publish 와 Subscribe 에서 강점 ActiveMQ 차이점은 신규 Subscribe 추가 되어도 처음부터 데이터를 새로 받을수 있음

* 단점
  * 학습 할게 많음
   * 분산기반 시스템이라서 Master, Slave, Replication 에 대한 개념이 필수
   * 다른 MQ 솔루션들과 다르게 Partition 등 다른 개념이 더 있음
  * 모니터링 툴에 대한 부재 Yahoo 에서 만든 Kafka Mananger 사용이 그나마 대안
    * Windows 에서 사용 하려면 손이 많이감 그래서 Docker 추천 아래 참조

## 2.2 Spring Boot
Spring Boot Autoconfiguration, Admin 등의 기능적 확장성 및 Source 직관성 현 세대의 고민이 녹아 있는 아키텍처 기반<br/>
Spring Boot 경험치 업을 위해서 2.0 을 하고 싶었지만 회의에서 솔루션 만들기는  2.0 은 시기 상조


# 3. 실행 예제
* kafka 실행 예제 Windows

        # zookeeper 실행
        bin\windows\zookeeper-server-start.bat config\zookeeper.properties
        # kafka 실행
        bin\windows\kafka-server-start.bat config\server.properties
        # topic 생성
        bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic zzizily-topic
        # topic 확인
        bin\windows\kafka-topics.bat --describe --zookeeper localhost:2181 --topic zzizily-topic
        # topic 데이터 보내기
        bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic zzizily-topic
        > 1
        > 2
        > 3
        # topic 데이터 받기
        bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --from-beginning --topic zzizily-topic
        # topic 확인
        bin\windows\kafka-topics.bat --describe --zookeeper localhost:2181 --topic zzizily-topic

* kafka 특정 topic 보관 주기 설정 (1시간) 및 삭제

        # topic 보관 주기 1시간(3600000) 설정
        bin\windows\kafka-configs.bat --zookeeper localhost:2181 --alter --entity-type topics --entity-name zzizily-topic --add-config retention.ms=3600000
        # topic 보관 주기 시간 확인
        bin\windows\kafka-topics.bat --zookeeper localhost:2181 --topic zzizily-topic --describe
        # topic 보관 주시 시간 삭제
        bin\windows\kafka-configs.bat --zookeeper localhost:2181 --alter --entity-type topics --entity-name ${TOPIC_NAME} --delete-config retention.ms


* kafka mananger docker 실행 예제

	    docker run -it --rm  -p 9000:9000 -e ZK_HOSTS="192.168.2.122:2181" -e APPLICATION_SECRET=letmein sheepkiller/kafka-manager