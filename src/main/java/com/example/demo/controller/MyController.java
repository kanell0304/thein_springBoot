package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MyController {

	// ../myhello?name=NiceToMeetYou
	@GetMapping("/myhello")
	public String Hello(@RequestParam("name") String name) {
		return "Hello" + name;
	}

}
