package com.hhm.test.service.impl;

import com.hhm.test.mapper.BookMapper;
import com.hhm.test.pojo.Book;
import com.hhm.test.pojo.BookType;
import com.hhm.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author hhmstart
 * @create 2022-09-13 9:50
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAllBook() {
        List<Book> bookList = bookMapper.getAllBook();
        for (Book book : bookList){
            BookType bookType = getBookType(book.getBookTypeId().getBookTypeId());
            book.setBookTypeId(bookType);
        }
        return bookList;
    }

    @Override
    public BookType getBookType(Integer id) {
        return bookMapper.getBookType(id);
    }

    @Override
    public int deleteBookBuyId(Integer id) {
        return bookMapper.deleteBookBuyId(id);
    }

    @Override
    public int insertBook(Book book) {
        return bookMapper.insertBook(book);
    }

    @Override
    public List<BookType> getALlBookType() {
        return bookMapper.getALlBookType();
    }

    @Override
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }
}
