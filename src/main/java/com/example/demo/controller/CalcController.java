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

    // ../add?a=2&b=3
    @GetMapping("/add")
    public String addCalc(@RequestParam int a, @RequestParam int b) {
        return calcService.add(a, b);
    }

    // ../subtraction?a=2&b=3
    @GetMapping("/subtraction")
    public String subtractionCalc(@RequestParam int a, @RequestParam int b) {
        return calcService.subtraction(a, b);
    }

    // ../multiple?a=2&b=3
    @GetMapping("/multiple")
    public String multipleCalc(@RequestParam int a, @RequestParam int b) {
        return calcService.multiple(a, b);
    }

    // ../divide?a=2&b=3
    @GetMapping("/divide")
    public String divideCalc(@RequestParam int a, @RequestParam int b) {
        return calcService.divide(a, b);
    }

    // ../remain?a=2&b=3
    @GetMapping("/remain")
    public String remainCalc(@RequestParam int a, @RequestParam int b) {
        return calcService.remain(a, b);
    }

}
