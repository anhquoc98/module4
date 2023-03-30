package com.example.manager_product.model;

public class Product {
    private int id;
    private String nameProduct;
    private String price;
    private String color;
    private String company;

    public Product() {
    }

    public Product(int id, String nameProduct, String price, String color, String company) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.color = color;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
