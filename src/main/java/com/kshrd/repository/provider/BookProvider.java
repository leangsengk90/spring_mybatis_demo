package com.kshrd.repository.provider;

import org.apache.ibatis.jdbc.SQL;

public class BookProvider {

    public String getBookById(){
        SQL sql = new SQL()
                .SELECT("*")
                .FROM("book")
                .WHERE("id = #{bookId}");
        return sql.toString();
    }
}
