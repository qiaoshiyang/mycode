package com.work.service.impl;

import com.work.entity.User;
import com.work.mapper.UserMapper;
import com.work.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务处理
 *
 * shiYang
 * 2022/6/25 20:10
 * VERSION:1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User save(User user) {
        return userMapper.save(user);
    }

    @Override
    public void delete(User user) {
        userMapper.delete(user);
    }

    @Override
    public Iterable<User> getAll() {
        return userMapper.findAll();
    }
}
