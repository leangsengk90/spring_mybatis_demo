package com.kshrd.controller;

import com.kshrd.constant.StatusCodeEnum;
import com.kshrd.exception.AppExceptionHandler;
import com.kshrd.model.Book;
import com.kshrd.payload.request.BookReq;
import com.kshrd.payload.response.BookRes;
import com.kshrd.payload.response.ResponseRes;
import com.kshrd.service.BookService;
//import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import com.kshrd.utillity.Pagination;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin
@RequestMapping("/book")
//@SecurityRequirement(name = "BookController") //for swagger openapi
public class BookController {

    private  final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<Object> getAllBook(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                                @RequestParam(value = "limit", defaultValue = "10") Integer limit) throws AppExceptionHandler {
        List<Book> bookList= new ArrayList<>();
        bookList = bookService.getAllBook(page, limit);

        Pagination pagination = new Pagination(
                page,
                limit,
                bookService.countBook()
        );

//        Pagination pagination = new Pagination();
//        pagination.setPage(page);
//        pagination.setLimit(limit);
//        pagination.setTotalCount(15);
//        pagination.setPageToShow(5);

        System.out.println("PAGINATION:" + pagination);

//        if(true)
//            throw new AppExceptionHandler(StatusCodeEnum.BAD_REQUEST.getNum(), StatusCodeEnum.BAD_REQUEST.getSms(), "/book");

        ResponseRes responseRes = new ResponseRes<>(
               StatusCodeEnum.OK.getNum(),
                LocalDateTime.now(),
                HttpStatus.OK,
                StatusCodeEnum.OK.getSms(),
                "/book",
                true,
                bookList,
                pagination
        );

        return new ResponseEntity<>(responseRes, responseRes.getHttpMessage());
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
