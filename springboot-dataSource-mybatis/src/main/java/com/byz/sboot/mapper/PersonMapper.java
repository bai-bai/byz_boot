package com.byz.sboot.mapper;

import com.byz.sboot.model.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("select * from person")
    public List<Person> getPersons();

    @Select("select * from person t where t.pid = #{id}")
    public Person getPersonById(int id);

    @Options(useGeneratedKeys =true, keyProperty = "pid")
    @Insert("insert into person(pid, pname, addr,gender, birth)" +
            " values(#{pid}, #{pname}, #{addr},#{gender}, #{birth})")
    public void insert(Person person);

    @Delete("delete from person where pid = #{id}")
    public void update(int id);

}
