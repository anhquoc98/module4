package com.example.form_binding.service.impl;

import com.example.form_binding.model.Gmail;
import com.example.form_binding.repository.impl.GmailRepository;
import com.example.form_binding.service.IGmailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GmailService implements IGmailService {
    GmailRepository gmailRepository = new GmailRepository();


    @Override
    public Gmail gmail() {
        return gmailRepository.gmail();
    }

    @Override
    public void update(Gmail gmails) {
        gmailRepository.update(gmails);
    }

    @Override
    public String[] getlanuagesList() {
        return gmailRepository.getlanuagesList();
    }

    @Override
    public Integer[] getpageSizeList() {
        return gmailRepository.getpageSizeList();
    }
}
