package com.hhm.test.mapper;

import com.hhm.test.pojo.Book;
import com.hhm.test.pojo.BookType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hhmstart
 * @create 2022-09-13 9:08
 */
public interface BookMapper {
    /**
     * 查询所有的图书信息
     * @return
     */
    List<Book> getAllBook();

    BookType getBookType(@Param("id") Integer id);

    int deleteBookBuyId(@Param("id") Integer id);

    int insertBook(@Param("book") Book book);

    List<BookType> getALlBookType();

    Book getBookById(Integer id);
}
