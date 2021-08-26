package com.polestar.study.demo.model;

import com.polestar.study.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private TestMapper testMapper;

    public Person selectPerson() {


        return testMapper.selectPerson(select);
    }
}
