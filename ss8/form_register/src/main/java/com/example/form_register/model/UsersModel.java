package com.example.form_register.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class UsersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name", columnDefinition = "varchar(45)")
    private String firstName;
    @Column(name = "last_name", columnDefinition = "varchar(255)")
    private String lastName;

    @Column(name = "phone", columnDefinition = "int")

    private int phone;

    @Column(name = "age", columnDefinition = "int")

    private int age;

    @Column(name = "email", columnDefinition = "varchar(255)")

    private String email;

    public UsersModel(Integer id, String firstName, String lastName, int phone, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public UsersModel() {
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
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
}
