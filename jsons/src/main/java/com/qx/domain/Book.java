package com.qx.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author ZedQ
 * @Date 2022/5/9 11:33
 * @ClassName: Book
 * @Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String bookId;
    private String bookName;
    private String author;
}
