package com.kshrd.repository;

import com.kshrd.model.Author;
import com.kshrd.utillity.JsonObjectTypeHandler;
import com.kshrd.utillity.ListTypeHandler;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AuthorRepository {

    @Select("SELECT * FROM author")
    @Results(id = "authorResults", value = {
            @Result(property = "email", column = "email", typeHandler = ListTypeHandler.class),
            @Result(property = "address", column = "address", typeHandler = JsonObjectTypeHandler.class)
    })
    List<Author> getAllAuthor();

    }
