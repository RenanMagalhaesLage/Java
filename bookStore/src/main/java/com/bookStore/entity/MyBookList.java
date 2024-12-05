package com.bookStore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MyBooks")
public class MyBookList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String price;
    private int book_id;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    // Construtores
    public MyBookList() {
    }

    public MyBookList(Long id, String title, String author, String price, int book_id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.book_id = book_id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
