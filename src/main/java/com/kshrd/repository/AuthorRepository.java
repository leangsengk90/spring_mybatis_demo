package com.kshrd.repository;

import com.kshrd.model.Author;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AuthorRepository {

    @Select("SELECT * FROM author")
    List<Author> getAllAuthor();

}
