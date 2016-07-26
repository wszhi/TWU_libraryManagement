package com.thoughtworks.service;

import com.thoughtworks.domain.BookInfo;
import com.thoughtworks.mappers.BookMapper;
import com.thoughtworks.mappers.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    public List<BookInfo> getBookList() {
        final SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        final BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        return mapper.getAllBooks();
    }
}
