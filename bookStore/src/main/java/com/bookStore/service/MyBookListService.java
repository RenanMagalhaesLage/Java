package com.bookStore.service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {
    @Autowired
    MyBookListRepository myBookRepository;

    public void saveMyBook(MyBookList book) {
        myBookRepository.save(book);
    }

    public List<MyBookList> findAll(){
        return myBookRepository.findAll();
    }

    public void delete(Long id){
        myBookRepository.deleteById(id);
    }
}
