package com.bookStore.controller;

import com.bookStore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyBookListController {
    @Autowired
    private MyBookListService myBookListService;

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        myBookListService.delete(id);
        return "redirect:/my_books";
    }
}
