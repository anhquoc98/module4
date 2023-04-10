package com.example.book_borrowing_application.dto;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;


public class BorrowBookCreateDTO {
    private int idBook;

    @NotNull(message = "input Name")
    private String nameBook;

    private String kindOfBook;

    @Max(value = 100)
    @NotNull(message = "input Quantity")
    private int quantity;

    @NotNull(message = "input price")
    private int price;
    private String borrowCode;

    public BorrowBookCreateDTO() {
    }

    public BorrowBookCreateDTO(int idBook, String nameBook, String kindOfBook, int quantity, int price) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.kindOfBook = kindOfBook;
        this.quantity = quantity;
        this.price = price;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getKindOfBook() {
        return kindOfBook;
    }

    public void setKindOfBook(String kindOfBook) {
        this.kindOfBook = kindOfBook;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String borrow() {

        this.quantity = quantity - 1;
        this.borrowCode = (int) Math.floor(Math.random() * (99999 - 10000 + 1) + 10000) + "";
        return this.borrowCode;
    }

    public void giveBack (String borrowCode)  {
        if (this.borrowCode.equals(borrowCode)) {
            this.quantity = quantity + 1;
        }
    }
}
