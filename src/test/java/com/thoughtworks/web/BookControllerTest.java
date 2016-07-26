package com.thoughtworks.web;

import com.thoughtworks.domain.BookInfo;
import com.thoughtworks.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class BookControllerTest {
    @Mock
    private BookService bookService;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void shouldGetMessageFromHelloService() {
        final BookController bookController = new BookController(bookService);
        ModelMap modelMap = new ModelMap();

        List<BookInfo> bookInfos=new ArrayList<BookInfo>();
        bookInfos.add(new BookInfo());
        when(bookService.getBookList()).thenReturn(bookInfos);

        bookController.displayBookList(modelMap);

        assertEquals(bookInfos, modelMap.get("bookList"));
    }

}
