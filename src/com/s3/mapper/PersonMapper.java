package com.s3.mapper;

import com.s3.pojo.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonMapper {

    public List<Person> getPersonByCondition(@Param("name") String name,
                                             @Param("address") String address);

}
