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
    public Gmail list() {
        return gmailRepository.list();
    }

    @Override
    public void add(Gmail gmail) {
        gmailRepository.add(gmail);
    }
}
