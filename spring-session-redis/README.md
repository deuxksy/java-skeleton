# spring-session-redis
Tomcat 에서 Session 을 공유 해야 할때 보통은 cloud 에서 많이 사용 하지만 Tomcat Context 끼리 Login 정보를 공유 할때도 유용함

* docker redis

    docker run -p 6379:6379 redis:4.0.11

# 참조
* [Guide to Spring Session](https://www.baeldung.com/spring-session)