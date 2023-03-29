package com.example.form_binding.repository.impl;

import com.example.form_binding.model.Gmail;
import com.example.form_binding.repository.IGmailRepository;

import java.util.ArrayList;
import java.util.List;

public class GmailRepository implements IGmailRepository {
//    static Gmail gmail = new Gmail("English", 25, false, "Thor King,Asgard");


    @Override
    public Gmail list() {
        return null;
    }

    @Override
    public String[] lanuages() {
        String[] laguage = {"English", "Vietnamese", "Japanese", "Chinese"};
        return laguage;
    }

    @Override
    public int[] pageSize() {
        int[] size = {5, 10, 15, 25, 50, 100};
        return size;
    }


}
