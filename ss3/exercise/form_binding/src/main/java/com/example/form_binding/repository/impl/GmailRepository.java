package com.example.form_binding.repository.impl;

import com.example.form_binding.model.Gmail;
import com.example.form_binding.repository.IGmailRepository;

public class GmailRepository implements IGmailRepository {
    private static Gmail gmail;
    private final String[] lanuagesList = new String[]{"English", "Vietnamese", " Japanese", "Chinese"};
    private final Integer[] pageSizeList = new Integer[]{5, 10, 15, 25, 50, 100};

    {
        gmail = new Gmail("English", 25, false, "Thor, King, Asgard");
    }

    @Override
    public Gmail gmail() {
        return gmail;
    }

    @Override
    public void update(Gmail gmails) {
        gmail.setLanguages(gmails.getLanguages());
        gmail.setPageSize(gmails.getPageSize());
        gmail.setSpamsFilter(gmails.getSpamsFilter());
        gmail.setSignature(gmails.getSignature());
    }

    @Override
    public String[] getlanuagesList() {
        return lanuagesList;
    }

    @Override
    public Integer[] getpageSizeList() {
        return pageSizeList;
    }
}
