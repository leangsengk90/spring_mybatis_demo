package com.kshrd.service;

import com.kshrd.model.Book;
import com.kshrd.payload.request.BookReq;
import com.kshrd.payload.response.BookRes;

import java.util.List;

public interface BookService {
    List<Book> getAllBook();
    Book getBookById(Integer id);
    BookRes addNewBook(BookReq bookReq);
    BookRes updateBookById(Integer id, BookReq bookReq);
    BookRes deleteBookById(Integer id);
}
