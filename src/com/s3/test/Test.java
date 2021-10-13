package com.s3.test;

import com.s3.pojo.Person;
import com.s3.service.PersonSevice;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        PersonSevice ps=new PersonSevice();
        List<Person> list = ps.getPersonbyCondition("李","南京");
        for (Person p : list) {
            System.out.println("员工的编号:"+p.getId()+"姓名:"+p.getName()+"地址:"+p.getAddress());
        }
    }
}
