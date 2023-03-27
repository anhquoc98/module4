package com.example.exercise_2.model.service;

import java.util.*;

public class TranslateService implements ITranslateService{
    static Map<String,String> stringStringMap = new HashMap<>();


    static {
        stringStringMap.put("apple","táo");
        stringStringMap.put("banana","chuối");
        stringStringMap.put("cherry","dâu");
        stringStringMap.put("orange","cam");
        stringStringMap.put("tangerine","quýt");
//        stringList.add("apple");
//        stringList.add("banana");
//        stringList.add("cherry");
//        stringList.add("orange");
//        stringList.add("tangerine");
//        stringList1.add("táo");
//        stringList1.add("chuối");
//        stringList1.add("dâu");
//        stringList1.add("cam");
//        stringList1.add("quýt");
    }
    @Override
    public String list(String translate) {
        for (Map.Entry<String, String> entry : stringStringMap.entrySet()) {
            if (translate.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return  null;
    }
}
