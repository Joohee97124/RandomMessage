package com.example.project.domain;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    @Column(name="name")
    String name;
    @Column(name="content")
    String content;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
