package com.example.book_borrowing_application.service;

import com.example.book_borrowing_application.model.BorrowBookModel;
import com.example.book_borrowing_application.dto.BorrowBookCreateDTO;

import java.util.List;

public interface IBookService {
    List<BorrowBookModel> list();

    BorrowBookModel findById(int id);

    void update(BorrowBookCreateDTO borrowBookCreateDTO);
}
