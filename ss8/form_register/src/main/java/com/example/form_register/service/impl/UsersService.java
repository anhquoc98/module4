package com.example.form_register.service.impl;

import com.example.form_register.dto.UsersDtoAdd;
import com.example.form_register.model.UsersModel;
import com.example.form_register.repository.IUsersRepository;
import com.example.form_register.service.IUsersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService implements IUsersService {
    @Autowired
    private IUsersRepository iUsersRepository;

    @Override
    public List<UsersModel> list() {
        return (List<UsersModel>) iUsersRepository.findAll();
    }

    @Override
    public void add(UsersDtoAdd usersDtoAdd) {
        UsersModel usersModel = new UsersModel();
        BeanUtils.copyProperties(usersDtoAdd, usersModel);
        iUsersRepository.save(usersModel);
    }

}
