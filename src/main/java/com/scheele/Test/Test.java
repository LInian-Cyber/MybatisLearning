package com.scheele.Test;

import com.scheele.entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {

        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        String statement ="com.scheele.mapper.AccountMapper.save";
        Account account = new Account(1L,"张三","123",123);
        session.insert(statement,account);
        session.commit();
    }
}
