package com.kshrd.service.serviceimp;

import com.kshrd.model.Book;
import com.kshrd.payload.request.BookReq;
import com.kshrd.payload.response.BookRes;
import com.kshrd.repository.BookRepository;
import com.kshrd.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookServiceImp implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBook(Integer page, Integer limit) {
        List<Book> bookList = new ArrayList<>();
        Integer newPage = (page - 1) * limit;
        bookList = bookRepository.getAllBook(newPage, limit);
        return bookList;
    }

    @Override
    public Book getBookById(Integer id) {
        Book book = bookRepository.getBookById(id);
        return book;
    }

    @Override
    public BookRes addNewBook(BookReq bookReq) {
        BookRes bookRes = new BookRes();
        bookRes = bookRepository.addNewBook(bookReq);
        System.out.println("BOOK:"+bookRes);
        return bookRes;
    }

    @Override
    public BookRes updateBookById(Integer id, BookReq bookReq) {
        BookRes bookRes = new BookRes();
        bookRes = bookRepository.updateBookById(id, bookReq);
        return bookRes;
    }

    @Override
    public BookRes deleteBookById(Integer id) {
        BookRes bookRes = new BookRes();
        bookRes = bookRepository.deleteBookById(id);
        return bookRes;
    }
}
