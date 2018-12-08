package com.zzizily.skeleton.spring4xml.person.service;

import com.zzizily.skeleton.spring4xml.person.mapper.PersonMapper;
import com.zzizily.skeleton.spring4xml.person.vo.PersonVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class PersonService {
  @Autowired
  private PersonMapper mapper;
  private static final Logger logger = LoggerFactory.getLogger(PersonService.class);

  public PersonVo selectPerson (long id){
    return mapper.selectPerson(id);
  }

  public String getDesc() {

    logger.debug("getDesc() is executed!");

    return "Gradle + Spring MVC Hello World Example";

  }

  public String getTitle(String name) {

    logger.debug("getTitle() is executed! $name : {}", name);

    if (StringUtils.isEmpty(name)) {
      return "Hello World";
    } else {
      return "Hello " + name;
    }

  }

}