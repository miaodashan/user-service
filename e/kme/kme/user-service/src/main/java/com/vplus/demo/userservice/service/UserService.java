package com.vplus.demo.userservice.service;

import com.vplus.demo.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends BaseService<User> {
    public User selectUserByAge(int age);
}
