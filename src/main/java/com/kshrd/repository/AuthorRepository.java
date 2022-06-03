package com.kshrd.repository;

import com.kshrd.model.Author;
import com.kshrd.utillity.JsonObjectTypeHandler;
import com.kshrd.utillity.JsonTypeHandler;
import com.kshrd.utillity.StringArrayTypeHandler;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.util.List;

@Mapper
public interface AuthorRepository {

    @Select("SELECT * FROM author")
    @Result(property = "email", column = "email", typeHandler = StringArrayTypeHandler.class)
    @Result(property = "address", column = "address", typeHandler = JsonObjectTypeHandler.class)
    List<Author> getAllAuthor();

}
