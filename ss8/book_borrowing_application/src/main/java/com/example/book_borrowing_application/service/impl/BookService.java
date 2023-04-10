package com.example.book_borrowing_application.service.impl;

import com.example.book_borrowing_application.model.BorrowBookModel;
import com.example.book_borrowing_application.dto.BorrowBookCreateDTO;

import com.example.book_borrowing_application.repository.IBookRepository;
import com.example.book_borrowing_application.service.IBookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<BorrowBookModel> list() {
        return (List<BorrowBookModel>) bookRepository.findAll();
    }

    @Override
    public BorrowBookCreateDTO findById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void update(BorrowBookCreateDTO borrowBookCreateDTO) {
        BorrowBookModel borrowBookModel = new BorrowBookModel();
        BeanUtils.copyProperties(borrowBookCreateDTO, borrowBookModel);
        bookRepository.save(borrowBookModel);
    }
}
