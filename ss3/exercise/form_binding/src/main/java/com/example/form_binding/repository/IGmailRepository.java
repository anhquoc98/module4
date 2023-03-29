package com.example.form_binding.repository;

import com.example.form_binding.model.Gmail;

import java.util.List;

public interface IGmailRepository {
    Gmail list();

    void add(Gmail gmail);
}
