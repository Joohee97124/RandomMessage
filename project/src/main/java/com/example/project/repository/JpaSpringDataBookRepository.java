package com.example.project.repository;

import com.example.project.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JpaSpringDataBookRepository extends JpaRepository<Book, Long>, BookRepository {
    @Override
    @Query(value="SELECT * FROM BOOK ORDER BY RAND() LIMIT 1", nativeQuery = true)
    public Book selectOne();
}
