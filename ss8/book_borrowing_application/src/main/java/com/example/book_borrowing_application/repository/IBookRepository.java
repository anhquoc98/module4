package com.example.book_borrowing_application.repository;

import com.example.book_borrowing_application.model.BorrowBookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<BorrowBookModel,Integer> {
}
