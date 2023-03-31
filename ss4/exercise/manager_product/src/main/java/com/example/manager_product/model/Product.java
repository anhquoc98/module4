package com.example.manager_product.model;

public class Product {
    private int id;
    private String name;
    private String price;
    private String description;
    private String company;

    public Product() {
    }

    public Product(int id, String name, String price, String description, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setNameProduct(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
