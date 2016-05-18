package com.hansung.mylibrary.dao;

import java.util.List;

import com.hansung.mylibrary.model.Book;
 
public interface BookDao {
     
    List<Book> getBookList();
 
}
