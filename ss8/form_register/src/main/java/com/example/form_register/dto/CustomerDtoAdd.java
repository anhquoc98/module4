package com.example.form_register.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Column;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Valid
public class CustomerDtoAdd {
    private int id;
    @NotBlank(message = "noInput")
    @Size(min = 5, max = 10, message = "input")
    private String firstName;
    private String lastName;
    @Size(min = 10, max = 11, message = "No Input")
    private String phone;

    @Min(value = 18)
    private int age;

    @Email
    private String email;

    public CustomerDtoAdd() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerDtoAdd(int id, String firstName, String lastName, String phone, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

//    @Override
//    public boolean supports(Class<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//
//    }
}
