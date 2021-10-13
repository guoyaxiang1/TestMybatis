package com.s3.service;

import com.s3.mapper.PersonMapper;
import com.s3.pojo.Person;
import com.s3.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

//业务
public class PersonSevice {

    public List<Person> getPersonbyCondition(String name, String address) {
        List<Person> list = new ArrayList<>();
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSession();
            //获取接口对象
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
            //调用接口方法
            list = personMapper.getPersonByCondition(name, address);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }
        return list;

    }
}
