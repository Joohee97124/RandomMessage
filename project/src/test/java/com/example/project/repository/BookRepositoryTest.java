package com.example.project.repository;

import com.example.project.domain.Book;
import com.example.project.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.Service;


@SpringBootTest
@Transactional
public class BookRepositoryTest {
    @Autowired
    BookService bookService;

    @Autowired
    BookRepository bookRepository;

    @Test
    void 랜덤조회(){
        Book book = new Book();
        book = bookService.selectOne();

        System.out.println("id" + book.getId());
        System.out.println("name" + book.getName());
        System.out.println("content" + book.getContent());
    }
}
