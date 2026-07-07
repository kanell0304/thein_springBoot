package com.gjl.student.controller;

import com.gjl.student.domain.Member;
import com.gjl.student.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("member")
    public List<Member> getMember(){

        List<Member> list = myService.selectMember();
        return list;

    }

}
