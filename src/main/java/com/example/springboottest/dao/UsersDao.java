package com.example.springboottest.dao;

import com.example.springboottest.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("usersDao")
@Mapper
public interface UsersDao {
    public List<Users> queryAllUser();
}
