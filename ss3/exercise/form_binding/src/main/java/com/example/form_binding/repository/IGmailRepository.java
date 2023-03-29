package com.example.form_binding.repository;

import com.example.form_binding.model.Gmail;

public interface IGmailRepository {
    Gmail gmail();

    void update(Gmail gmails);

    String[] getlanuagesList();

    Integer[] getpageSizeList();
}
