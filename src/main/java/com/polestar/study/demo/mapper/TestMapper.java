package com.polestar.study.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

    @Select("SELECT * FROM TEST")
    String getCurrentTime();


}

