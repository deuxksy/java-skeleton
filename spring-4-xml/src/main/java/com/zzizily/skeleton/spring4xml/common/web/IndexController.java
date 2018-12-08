package com.zzizily.skeleton.spring4xml.common.web;

import com.zzizily.skeleton.spring4xml.person.service.PersonService;
import com.zzizily.skeleton.spring4xml.person.vo.PersonVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {

  private final Logger logger = LoggerFactory.getLogger(IndexController.class);

  @Autowired
  private PersonService personService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(Map<String, Object> model) {

    logger.debug("index() is executed!");
    PersonVo person = personService.selectPerson(1);
    if (null != person) {
      model.put("title", person.getSex().getValue());
      model.put("msg", person.getName());
    }
    return "index";
  }

  @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
  public ModelAndView hello(@PathVariable("name") String name) {

    logger.debug("hello() is executed - $name {}", name);

    ModelAndView model = new ModelAndView();
    model.setViewName("index");

    model.addObject("title", personService.getTitle(name));
    model.addObject("msg", personService.getDesc());

    return model;

  }

}