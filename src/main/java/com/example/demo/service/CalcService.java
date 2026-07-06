package com.example.demo.service;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalcService {

    String add(@RequestParam int a, @RequestParam int b);
    String subtraction(@RequestParam int a, @RequestParam int b);
    String multiple(@RequestParam int a, @RequestParam int b);
    String divide(@RequestParam int a, @RequestParam int b);
    String remain(@RequestParam int a, @RequestParam int b);

}
