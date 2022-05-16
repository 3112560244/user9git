package com.qx.dao;

import com.qx.domain.User;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public interface UserDao {


    public void save(User user);

    public User findById(int id);

    public List<User> findByName(String name);

    public List<User> findByNameAndGender(@PathVariable (value = "name") String name,@PathVariable (value = "gender") String gender);

    public List<User> findAll();

    public void update(User user);

    public void delteById(int id);

}
