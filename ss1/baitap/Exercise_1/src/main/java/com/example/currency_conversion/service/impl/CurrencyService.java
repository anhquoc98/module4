package com.example.currency_conversion.service.impl;

import com.example.currency_conversion.service.ICurrencyService;

public class CurrencyService implements ICurrencyService {

    @Override
    public Double changMoney(double m) {
        Double n = m * 24000;
        return n;
    }
}
