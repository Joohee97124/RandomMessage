package com.example.project.repository;

import com.example.project.domain.Book;

import java.util.Optional;

public interface BookRepository {
    public Book selectOne();
}
