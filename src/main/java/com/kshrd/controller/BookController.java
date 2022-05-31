package com.kshrd.controller;

import com.kshrd.model.Book;
import com.kshrd.payload.request.BookReq;
import com.kshrd.payload.response.BookRes;
import com.kshrd.service.BookService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/book")
@SecurityRequirement(name = "BookController") //for swagger
public class BookController {

    private  final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBook(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                 @RequestParam(value = "limit", defaultValue = "10") Integer limit){
        List<Book> bookList= new ArrayList<>();
        bookList = bookService.getAllBook(page, limit);
        return bookList;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id){
        Book book = bookService.getBookById(id);
        return book;
    }

    @PostMapping()
    public BookRes addNewBook(@RequestBody BookReq bookReq){
        BookRes bookRes = new BookRes();
        bookRes = bookService.addNewBook(bookReq);
        return bookRes;
    }

    @PutMapping("/{id}")
    public BookRes updateBookById(@PathVariable Integer id, @RequestBody BookReq bookReq){
        BookRes bookRes = new BookRes();
        bookRes = bookService.updateBookById(id, bookReq);
        return bookRes;
    }

    @DeleteMapping("/{id}")
    public BookRes deleteBookById(@PathVariable Integer id){
        BookRes bookRes = new BookRes();
        bookRes = bookService.deleteBookById(id);
        return  bookRes;
    }


}
