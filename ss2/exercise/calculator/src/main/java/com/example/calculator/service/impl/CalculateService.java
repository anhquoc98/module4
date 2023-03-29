package com.example.calculator.service.impl;

import com.example.calculator.service.ICalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculateService implements ICalculateService {

    @Override
    public double calculator(double numberFirst, double numberSecond, String calculation) {
        double result =0;
        switch (calculation) {
            case "+":
                result = numberFirst + numberSecond;
                break;
            case "-":
                result = numberFirst - numberSecond;
                break;
            case "*":
                result = numberFirst * numberSecond;
                break;
            case "/":
                result = numberFirst / numberSecond;
                break;
        }
        return result;
    }
}
