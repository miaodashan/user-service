package com.vplus.demo.userservice.mapper;

import com.vplus.demo.userservice.model.User;
import com.vplus.demo.userservice.core.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
    public User selectUserByAge(int Age);
}
