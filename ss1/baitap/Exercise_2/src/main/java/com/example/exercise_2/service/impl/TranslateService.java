package com.example.exercise_2.service.impl;

import com.example.exercise_2.repository.ITransalateRepository;
import com.example.exercise_2.repository.impl.TranslateRepository;
import com.example.exercise_2.service.ITranslateService;

import java.util.*;

public class TranslateService implements ITranslateService {
    private final ITransalateRepository repository = new TranslateRepository();

    @Override
    public String list(String translate) {
        return repository.list(translate);
    }
}
