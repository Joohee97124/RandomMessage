package com.example.project.service;

import com.example.project.domain.Book;
import com.example.project.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

//@Service
@Transactional
public class BookService {
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book selectOne(){
        return bookRepository.selectOne();
    }
}
