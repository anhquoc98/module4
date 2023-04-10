package com.example.book_borrowing_application.model;

import com.example.book_borrowing_application.dto.BorrowBookCreateDTO;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
@Entity
@Table
public class BorrowBookModel extends BorrowBookCreateDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_book")
    private int idBook;

    private String nameBook;

    private String kindOfBook;


    private int quantity;

    private int price;

    public BorrowBookModel() {
    }

    public BorrowBookModel(int idBook, String nameBook, String kindOfBook, int quantity, int price) {
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


}
