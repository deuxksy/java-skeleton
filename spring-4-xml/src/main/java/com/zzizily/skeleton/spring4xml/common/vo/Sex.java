package com.zzizily.skeleton.spring4xml.common.vo;

/**
 * Created by crom on 2016. 5. 1..
 */
public enum Sex {
  MAN (1,"남성"),
  WOMEN (2,"여성");

  private Integer code;
  private String value;

  private Sex (Integer code, String name) {
    this.code = code;
    this.value = name;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return this.value;
  }
}
