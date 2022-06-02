package com.kshrd.repository;

import com.kshrd.model.Author;
import com.kshrd.model.Book;
import com.kshrd.payload.request.BookReq;
import com.kshrd.payload.response.BookRes;
import com.kshrd.repository.provider.BookProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookRepository {
    @Select("SELECT * FROM book OFFSET #{page} LIMIT #{limit}")
    @Result(property = "importDate", column = "import_date")
    @Result(property = "author", column = "author_id",
        one = @One(select = "getAuthorById")
    )
    List<Book> getAllBook(Integer page, Integer limit);


    //  Method 1;
//    @Select("SELECT * FROM book WHERE id = #{bookId}")
//    @Result(property = "importDate", column = "import_date")
//    @Result(property = "author", column = "author_id",
//            one = @One(select = "com.kshrd.repository.BookRepository.getAuthorById")
//    )
//    Book getBookById(Integer bookId);

    //  Method 2;
    @SelectProvider(type = BookProvider.class, method = "getBookById")
    @Result(property = "importDate", column = "import_date")
    @Result(property = "author", column = "author_id",
            one = @One(select = "com.kshrd.repository.BookRepository.getAuthorById")
    )
    Book getBookById(Integer bookId);

    //For testing: This methods should be in AuthorRepository
    //if this function in another repo(AuthorRepository) => one = @One(select = "com.kshrd.repository.AuthorRepository.getAuthorById")
    @Select("SELECT * FROM author WHERE id = #{authorId}")
    Author getAuthorById(Integer authorId);

    @Select("INSERT INTO book(name, import_date, author_id) VALUES(#{book.name}, #{book.importDate}, #{book.authorId}) RETURNING *")
    @Result(property = "importDate", column = "import_date")
    @Result(property = "authorId", column = "author_id")
    BookRes addNewBook(@Param("book") BookReq bookReq);

    @Select("UPDATE book SET name=#{book.name}, " +
            "import_date=#{book.importDate}, author_id=#{book.authorId}" +
            "WHERE id=#{bookId} RETURNING *")
    @Result(property = "importDate", column = "import_date")
    @Result(property = "authorId", column = "author_id")
    BookRes updateBookById(@Param("bookId") Integer id, @Param("book") BookReq bookReq);

    @Select("DELETE FROM book WHERE id=#{id} RETURNING *")
    @Result(property = "importDate", column = "import_date")
    @Result(property = "authorId", column = "author_id")
    BookRes deleteBookById(Integer id);

    @Select("SELECT count(*) FROM book")
    Integer countBook();
}
