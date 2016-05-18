package com.hansung.mylibrary.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
import com.hansung.mylibrary.dao.BookDao;
import com.hansung.mylibrary.model.Book;
 
@Repository("bookDao")
public class BookDaoImpl implements BookDao{
     
    @Autowired(required=true)
    private SqlSession sqlSession;
 
    public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }
 
    @Override
    public List<Book> getBookList() {
         
        return sqlSession.selectList("getBookList");
    }
 
}