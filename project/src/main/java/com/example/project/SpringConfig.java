package com.example.project;

import com.example.project.repository.BookRepository;
import com.example.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private final BookRepository bookRepository;

    @Autowired
    public SpringConfig(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Bean
    public BookService bookService(){
        return new BookService(bookRepository);
    }
}
