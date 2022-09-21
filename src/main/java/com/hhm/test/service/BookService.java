package com.hhm.test.service;

import com.hhm.test.pojo.Book;
import com.hhm.test.pojo.BookType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hhmstart
 * @create 2022-09-13 9:49
 */
public interface BookService {
    List<Book> getAllBook();
    BookType getBookType(Integer id);
    int deleteBookBuyId(Integer id);

    int insertBook(@Param("book") Book book);

    List<BookType> getALlBookType();

    Book getBookById(@Param("id") Integer id);
}
