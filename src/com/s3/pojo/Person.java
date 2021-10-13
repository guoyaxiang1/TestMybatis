package com.s3.pojo;

/**
 * 实体类
 */
public class Person {
    private Integer id;//主键编号
    private String name;
    private Integer age;
    private String address;
    private Integer dept_id;//外键，部门编号

    //alt+insert


    public Person() {
    }

    public Person(Integer id, String name, Integer age, String address, Integer dept_id) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.dept_id = dept_id;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }




/*
    id,
    NAME,
    age,
    address,
    dept_id
*/

}
