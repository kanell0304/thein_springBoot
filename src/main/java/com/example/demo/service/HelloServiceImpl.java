package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class HelloServiceImpl implements HelloService {

	@Override
	public String helloPrint(String name) {
		return "안녕하세요! 저는 " + name + "입니다!";
	}

}
