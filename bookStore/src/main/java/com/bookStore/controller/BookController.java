package com.bookStore.controller;

import org.springframework.ui.Model;
import com.bookStore.entity.Book;
import com.bookStore.entity.MyBookList;
import com.bookStore.service.BookService;
import com.bookStore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private MyBookListService myBookListService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/book_register")
    public String register(){
        return "bookRegister";
    }
    @GetMapping("/avaible_books")
    public ModelAndView getAllBooks(){
        List<Book> list = bookService.findAll();
        //ModelAndView modelAndView = new ModelAndView();
        //modelAndView.addObject("list", list);
        //modelAndView.setViewName("bookList");
        return new ModelAndView("bookList", "book", list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
        System.out.println("Received: " + book);
        bookService.add(book);
        return "redirect:/avaible_books";
    }

    @GetMapping("/my_books")
    public String getMyBooks(Model model){
        List<MyBookList> list = myBookListService.findAll();
        model.addAttribute("book", list);
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id){
        Book book = bookService.findById(id);
        MyBookList list = new MyBookList();

        list.setTitle(book.getTitle());
        list.setAuthor(book.getAuthor());
        list.setPrice(book.getPrice());
        //list.setBook(book);
        list.setBook_id(book.getId());
        System.out.println(list);
        myBookListService.saveMyBook(list);
        return "redirect:/my_books";
    }

    @RequestMapping("/deleteBook/{id}")
    public String delete(@PathVariable int id) {
        bookService.delete(id);
        return "redirect:/avaible_books";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("book", book);
        return "bookEdit";
    }
}
