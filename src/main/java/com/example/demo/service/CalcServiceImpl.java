package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String add(int a, int b) {
        return (a + b) + "입니다.";
    }

    @Override
    public String subtraction(int a, int b) {
        return (a - b) + "입니다.";
    }

    @Override
    public String multiple(int a, int b) {
        return (a * b) + "입니다.";
    }

    @Override
    public String divide(int a, int b) {
        return (a / b) + "입니다.";
    }

    @Override
    public String remain(int a, int b) {
        return (a % b) + "입니다.";
    }

}
