package com.example.demo.controller;

import com.example.demo.service.CalcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalcController {

    private final CalcService calcService;

    @GetMapping("/add")
    public String addCalc(@RequestParam int a, @RequestParam int b) {
        return calcService.add(a, b);
    }

    @GetMapping("/subtraction")
    public String subtractionCalc(@RequestParam int a, @RequestParam int b) {
        return calcService.subtraction(a, b);
    }

    @GetMapping("/multiple")
    public String multipleCalc(@RequestParam int a, @RequestParam int b) {
        return calcService.multiple(a, b);
    }

    @GetMapping("/divide")
    public String divideCalc(@RequestParam int a, @RequestParam int b) {
        return calcService.divide(a, b);
    }

    @GetMapping("/remain")
    public String remainCalc(@RequestParam int a, @RequestParam int b) {
        return calcService.remain(a, b);
    }

}
