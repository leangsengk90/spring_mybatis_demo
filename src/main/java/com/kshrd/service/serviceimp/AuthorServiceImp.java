package com.kshrd.service.serviceimp;

import com.kshrd.model.Author;
import com.kshrd.payload.request.AuthorReq;
import com.kshrd.repository.AuthorRepository;
import com.kshrd.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImp implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImp(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAllAuthor(Integer page, Integer limit) {
        List<Author> authorList = new ArrayList<>();
        authorList = authorRepository.getAllAuthor(page, limit);
        System.out.println("AUTHOR: "+authorList);
        return authorList;
    }

    @Override
    public Author addNewAuthor(AuthorReq authorReq) {
        Author newAuthor = authorRepository.addNewAuthor(authorReq);
        return newAuthor;
    }

    @Override
    public Integer countAthor() {
        return authorRepository.countAuthor();
    }
}
