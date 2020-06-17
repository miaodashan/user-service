package com.vplus.demo.userservice.service.impl;

import com.vplus.demo.userservice.mapper.UserMapper;
import com.vplus.demo.userservice.model.User;
import com.vplus.demo.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserByAge(int age) {
        return userMapper.selectUserByAge(age);
    }
}
