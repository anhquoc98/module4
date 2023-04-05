package com.example.form_register.repository;

import com.example.form_register.model.UsersModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepository extends PagingAndSortingRepository<UsersModel, Integer> {
}
