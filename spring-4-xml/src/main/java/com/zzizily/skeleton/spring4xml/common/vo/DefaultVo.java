package com.zzizily.skeleton.spring4xml.common.vo;

import java.util.Date;

/**
 * Created by crom on 2016. 5. 1..
 */
public class DefaultVo {
  private Long seq;
  private String modId;
  private Date modTs;
  private String crtId;
  private Date crtTs;

  public Long getSeq() {
    return seq;
  }

  public void setSeq(Long seq) {
    this.seq = seq;
  }

  public String getModId() {
    return modId;
  }

  public void setModId(String modId) {
    this.modId = modId;
  }

  public Date getModTs() {
    return modTs;
  }

  public void setModTs(Date modTs) {
    this.modTs = modTs;
  }

  public String getCrtId() {
    return crtId;
  }

  public void setCrtId(String crtId) {
    this.crtId = crtId;
  }

  public Date getCrtTs() {
    return crtTs;
  }

  public void setCrtTs(Date crtTs) {
    this.crtTs = crtTs;
  }
}
