package com.example.exercise_2.repository.impl;

import com.example.exercise_2.repository.ITransalateRepository;

import java.util.HashMap;
import java.util.Map;

public class TranslateRepository implements ITransalateRepository {
    static Map<String, String> stringStringMap = new HashMap<>();


    static {
        stringStringMap.put("apple", "táo");
        stringStringMap.put("banana", "chuối");
        stringStringMap.put("cherry", "dâu");
        stringStringMap.put("orange", "cam");
        stringStringMap.put("tangerine", "quýt");
    }

    @Override
    public String list(String translate) {
        for (Map.Entry<String, String> entry : stringStringMap.entrySet()) {
            if (translate.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }
}
