package com.thoughtworks.web;

import com.thoughtworks.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/listOfBook", method = RequestMethod.GET)
    public String displayBookList(ModelMap model) {

        model.addAttribute("bookList", bookService.getBookList());
        return "bookListPage";
    }
}