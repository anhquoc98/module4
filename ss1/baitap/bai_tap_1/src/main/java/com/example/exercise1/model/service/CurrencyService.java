package com.example.exercise1.model.service;

public class CurrencyService implements ICurrencyService{

    @Override
    public Double changMoney(double m) {
        Double n =m*24000;
        return n;
    }
}
