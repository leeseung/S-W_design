package com.hansung.mylibrary.service.impl;

import java.util.List;

import javax.annotation.Resource;
 
import org.springframework.stereotype.Service;
 
import com.hansung.mylibrary.dao.BookDao;
import com.hansung.mylibrary.model.Book;
import com.hansung.mylibrary.service.BookService;
 
@Service("bookService")
public class BookServiceImpl implements BookService {
     
    @Resource(name="bookDao")
    private BookDao bookDao;
 
    @Override
    public List<Book> getBookList() {
        return bookDao.getBookList();
    }
 
}