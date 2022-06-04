package com.kshrd.service;

import com.kshrd.model.Author;
import com.kshrd.payload.request.AuthorReq;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthor(Integer page, Integer limit);
    Author addNewAuthor(AuthorReq authorReq);
    Integer countAthor();
}
