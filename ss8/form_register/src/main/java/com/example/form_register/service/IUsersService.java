package com.example.form_register.service;

import com.example.form_register.dto.UsersDtoAdd;
import com.example.form_register.model.UsersModel;

import java.util.List;

public interface IUsersService {
    List<UsersModel> list();

    void add(UsersDtoAdd usersModel);

}
