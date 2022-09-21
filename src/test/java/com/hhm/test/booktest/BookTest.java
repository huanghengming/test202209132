package com.hhm.test.booktest;

import com.hhm.test.mapper.BookMapper;
import com.hhm.test.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author hhmstart
 * @create 2022-09-13 9:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class BookTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void test01(){
        List<Book> book = bookMapper.getAllBook();
        System.out.println(book.toString());
    }
}
