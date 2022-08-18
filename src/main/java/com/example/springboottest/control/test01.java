package com.example.springboottest.control;

import com.example.springboottest.dao.UsersDao;
import com.example.springboottest.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class test01 {

    @Qualifier("usersDao")
    @Autowired
    UsersDao usersDao;

    @ResponseBody
    @RequestMapping("/test")
    public List<Users>  test001() {
        List<Users> users = usersDao.queryAllUser();
        return users;
    }
}
