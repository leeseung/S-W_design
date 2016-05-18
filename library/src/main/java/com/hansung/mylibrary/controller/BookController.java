package com.hansung.mylibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hansung.mylibrary.service.BookService;

@Controller
@ComponentScan("com.hansung.mylibrary")
public class BookController {
    
   @Autowired(required=true)
   BookService bookService;
    
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home(Model model) {
        
       model.addAttribute("books", bookService.getBookList());       
        
       return "/book/book";
   }
    
}