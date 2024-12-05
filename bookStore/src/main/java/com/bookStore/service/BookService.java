package com.bookStore.service;

import com.bookStore.entity.Book;
import com.bookStore.entity.MyBookList;
import com.bookStore.repository.BookRepository;
import com.bookStore.repository.MyBookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private MyBookListRepository myBookListRepository;


    public void add(Book book) {
        bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(int id) {
        return bookRepository.findById(id).get();
    }

    public void delete(int id) {
        List<MyBookList> myBooks = myBookListRepository.findAll();

        for (MyBookList myBook : myBooks) {
            if (myBook.getBook_id() == id) {
                myBookListRepository.delete(myBook);
            }
        }
        bookRepository.deleteById(id);
    }
}
