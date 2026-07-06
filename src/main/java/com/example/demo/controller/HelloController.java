package com.example.demo.controller;

import com.example.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
public class HelloController {

	private final HelloService helloService;

	// ../hello?name=홍길동
    @GetMapping("/hello")
	public String hello() {
		return helloService.helloPrint("이름");
	}
	
}
