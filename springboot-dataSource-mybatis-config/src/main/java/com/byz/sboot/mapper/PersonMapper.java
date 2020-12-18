package com.byz.sboot.mapper;

import com.byz.sboot.model.Person;

import java.util.List;

public interface PersonMapper {

    public List<Person> selectAll();

    public Person selectById(int id);

    public void insert(Person person);

    public void update(int id);

}
