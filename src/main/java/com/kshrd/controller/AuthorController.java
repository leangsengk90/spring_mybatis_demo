package com.kshrd.controller;

import com.kshrd.constant.StatusCodeEnum;
import com.kshrd.model.Author;
import com.kshrd.payload.request.AuthorReq;
import com.kshrd.payload.response.ResponseRes;
import com.kshrd.service.AuthorService;
import com.kshrd.utillity.Pagination;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public ResponseEntity<Object> getAllAuthor(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                     @RequestParam(value = "limit", defaultValue = "10") Integer limit
                                     ){
        //Pagination
        if(page <= 0) page = 1;
        Integer newPage = (page - 1) * limit;

        List<Author> authorList = new ArrayList<>();
        authorList = authorService.getAllAuthor(newPage, limit);

        Pagination pagination = new Pagination(
                page,
                limit,
                authorService.countAthor()
        );

        ResponseRes responseRes = new ResponseRes<>(
                StatusCodeEnum.OK.getNum(),
                LocalDateTime.now(),
                HttpStatus.OK,
                StatusCodeEnum.OK.getSms(),
                "/author",
                true,
                authorList,
                pagination
        );

        return new ResponseEntity<>(responseRes, responseRes.getHttpMessage());
    }

    @PostMapping
    public ResponseEntity<Object> addNewAuthor(@RequestBody AuthorReq authorReq){
        Author newAuthor = authorService.addNewAuthor(authorReq);

        ResponseRes responseRes = new ResponseRes<>(
                StatusCodeEnum.CRETAED.getNum(),
                LocalDateTime.now(),
                HttpStatus.CREATED,
                StatusCodeEnum.CRETAED.getSms(),
                "/author",
                true,
                newAuthor,
                null
        );

        return new ResponseEntity<>(responseRes, responseRes.getHttpMessage());
    }

}
