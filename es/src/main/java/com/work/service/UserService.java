package com.work.service;

import com.work.entity.User;

/**
 * 用户接口
 *
 * shiYang
 * 2022/6/25 20:09
 * VERSION:1.0.0
 */
public interface UserService {

    User save(User user);

    void delete(User user);

    Iterable<User> getAll();


}
