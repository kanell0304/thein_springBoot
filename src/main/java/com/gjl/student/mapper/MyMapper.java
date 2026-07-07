package com.gjl.student.mapper;

import com.gjl.student.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyMapper {

    List<Member> selectMember();

}
