package com.kshrd.repository.provider;

import org.apache.ibatis.jdbc.SQL;

public class BookProvider {

    public String getBookById(Integer bookId){
        //** Method 1 **/
//        SQL sql = new SQL()
//                .SELECT("*")
//                .FROM("book")
//                .WHERE("id = #{bookId}");
//        return sql.toString();

        //** Method 2 **/
        return new SQL(){{
            SELECT("*");
            FROM("book");
            if(bookId != null){
                WHERE("id = #{bookId}");
            }
        }}.toString();
    }
}
