package com.zzizily.skeleton.spring4xml.person.mapper;

import com.zzizily.skeleton.spring4xml.person.vo.PersonVo;

/**
 * Created by crom on 2016. 5. 1..
 */
public interface PersonMapper {
  PersonVo selectPerson (long id);
}
