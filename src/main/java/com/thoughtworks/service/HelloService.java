package com.thoughtworks.service;

import com.thoughtworks.mappers.HelloMapper;
import com.thoughtworks.mappers.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getGreeting() {
        final SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        final HelloMapper mapper = sqlSession.getMapper(HelloMapper.class);
        return mapper.getGreeting();
    }

}
