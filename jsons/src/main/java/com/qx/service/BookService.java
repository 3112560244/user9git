package com.qx.service;

import com.qx.domain.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZedQ
 * @Date 2022/5/9 16:51
 * @ClassName: BookService
 * @Description: TODO
 */
@Service
public class BookService {
    private static List<Book> db = new ArrayList<>();

    public void addBook(Book book){
        db.add(book);
    }

    public List<Book> findAll(){
        return db;
    }
}
