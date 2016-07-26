package com.thoughtworks.mappers;


import com.thoughtworks.domain.BookInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {
    @Select("select * from bookInfo")
    public List<BookInfo> getAllBooks();
}
