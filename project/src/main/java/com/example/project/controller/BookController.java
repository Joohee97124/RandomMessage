package com.example.project.controller;

import com.example.project.domain.Book;
import com.example.project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class BookController {
    public final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/random")
    public String selectOne(Model model){
        Book book = bookService.selectOne();
        model.addAttribute("book", book);
        System.out.println("book" + model.getAttribute("book").toString());

        return "random/do";

    }
}
