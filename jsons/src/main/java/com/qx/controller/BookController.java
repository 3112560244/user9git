package com.qx.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qx.domain.Book;
import com.qx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author ZedQ
 * @Date 2022/5/9 11:32
 * @ClassName: BookController
 * @Description: TODO
 */

@Controller
@RequestMapping(value = "/json")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/show")
    public String show(){
        return "testRequestBody";
    }

    @RequestMapping(value = "/testRequestBody",method = RequestMethod.POST)
    public void testRequestBody(@RequestBody Book book, HttpServletResponse response) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(book));
        book.setAuthor("里西奥名,千禧");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(objectMapper.writeValueAsString(book));

    }

    @RequestMapping(value = "shows")
    public String shows(){
        return "testResponseBody";
    }

    @RequestMapping(value = "/testResponseBody",method = RequestMethod.POST)
    @ResponseBody
    public List<Book> testResponseBody(@RequestBody Book book){
        bookService.addBook(book);
        return bookService.findAll();
    }
}
