package com.example.form_binding.service;

import com.example.form_binding.model.Gmail;

import java.util.List;

public interface IGmailService {
    Gmail gmail();

    void update(Gmail gmails);

    String[] getlanuagesList();

    Integer[] getpageSizeList();
}
