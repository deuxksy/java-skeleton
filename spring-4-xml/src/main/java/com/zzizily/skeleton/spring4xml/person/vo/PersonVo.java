package com.zzizily.skeleton.spring4xml.person.vo;

import com.zzizily.skeleton.spring4xml.common.vo.DefaultVo;
import com.zzizily.skeleton.spring4xml.common.vo.Sex;

/**
 * Created by crom on 2016. 5. 1..
 */
public class PersonVo extends DefaultVo {
  private String name;
  private Integer age;
  private Sex sex;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Sex getSex() {
    return sex;
  }

  public void setSex(Sex sex) {
    this.sex = sex;
  }
}

