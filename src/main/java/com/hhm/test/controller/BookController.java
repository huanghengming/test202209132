package com.hhm.test.controller;


import com.hhm.test.mapper.BookMapper;
import com.hhm.test.pojo.Book;
import com.hhm.test.pojo.BookType;
import com.hhm.test.service.BookService;
import com.hhm.test.util.ReturnJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hhmstart
 * @create 2022-09-13 8:33
 */
@RestController
@CrossOrigin
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 查询所有的数据
     *
     * @return
     */
    @RequestMapping(value = "/list")
    public List<Book> getAllBook() {
        return bookService.getAllBook();
    }

    @RequestMapping(value = "/book/{id}")
    public ReturnJson deleteBook(@PathVariable("id") Integer id) {
        ReturnJson returnJson = new ReturnJson();
        int i = bookService.deleteBookBuyId(id);
        if (i == 1) {
            returnJson.setMsg("删除成功");
        } else {
            returnJson.setMsg("删除失败");
        }
        return returnJson;
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public ReturnJson insertBook(@RequestBody Book book) {
        int i = bookService.insertBook(book);
        ReturnJson returnJson = new ReturnJson();
        if (i == 1) {
            returnJson.setMsg("添加成功");
        } else {
            returnJson.setMsg("添加失败");
        }
        return returnJson;
    }

    @RequestMapping("/selectbooktype")
    public List<BookType> selectbooktype() {
        List<BookType> list = bookService.getALlBookType();
        return list;
    }

    @RequestMapping("/downLoad")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws
            IOException {
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/document/图书数据模板.xlsx");
        InputStream is = new FileInputStream(realPath);
        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=图书数据模板.xlsx");
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers,
                statusCode);
        is.close();
        return responseEntity;
    }

    @RequestMapping(value = "/getBookById/{id}",method = RequestMethod.GET)
    public Book getBookById(@PathVariable("id") Integer id){
        return bookService.getBookById(id);
    }

}
