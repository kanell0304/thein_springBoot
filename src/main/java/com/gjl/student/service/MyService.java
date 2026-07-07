package com.gjl.student.service;

import com.gjl.student.domain.Member;
import com.gjl.student.mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    private MyMapper myMapper;

    public List<Member> selectMember(){
        return myMapper.selectMember();
    }

}
