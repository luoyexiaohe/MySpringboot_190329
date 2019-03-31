package com.hfy.example.service;

import com.hfy.example.bean.User;
import com.hfy.example.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userDao ;

    public List<User> listAllUser() {
        return userDao.listAllUser();
    }

    public User getUser(){
        return userDao.selectByPrimaryKey(1);
    }
}
