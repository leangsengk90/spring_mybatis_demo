package com.kshrd.repository;

import com.kshrd.model.Author;
import com.kshrd.payload.request.AuthorReq;
import com.kshrd.utillity.JsonObjectTypeHandler;
import com.kshrd.utillity.ListTypeHandler;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AuthorRepository {

    @Select("SELECT * FROM author ORDER BY id OFFSET #{page} LIMIT #{limit}")
    @Results(id = "authorResults", value = {
            @Result(property = "email", column = "email", typeHandler = ListTypeHandler.class),
            @Result(property = "address", column = "address", typeHandler = JsonObjectTypeHandler.class),
            @Result(property = "createDate", column = "create_date")
    })
    List<Author> getAllAuthor(Integer page, Integer limit);

    @Select("INSERT INTO author(name, email, address, create_date) " +
            "VALUES(#{authorReq.name}, " +
            "#{authorReq.email, typeHandler=com.kshrd.utillity.ListTypeHandler}, " +
            "#{authorReq.address, typeHandler=com.kshrd.utillity.JsonObjectTypeHandler}, " +
            "#{authorReq.createDate}) " +
            "RETURNING *")
    @ResultMap("authorResults")
    Author addNewAuthor(@Param("authorReq") AuthorReq authorReq);

    @Select("SELECT count(*) FROM author")
    Integer countAuthor();
}
