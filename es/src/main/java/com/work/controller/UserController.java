package com.work.controller;

import com.work.entity.User;
import com.work.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户接口
 *
 * shiYang
 * 2022/6/25 20:08
 * VERSION:1.0.0
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户接口", tags = "用户接口")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    @ApiOperation("es索引新增用户数据")
    public String insert() {
        User user = new User();
        user.setId("1");
        user.setUsername("张三");
        user.setPassword("zhangsan");
        userService.save(user);
        return getAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ApiOperation("es索引删除用户数据")
    public String delete() {
        User user = new User();
        user.setId("1");
        userService.delete(user);
        return getAll();
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ApiOperation("es索引查询用户数据")
    public String getAll() {
        List<User> list = new ArrayList<>();
        Iterable<User> iterable = userService.getAll();
        iterable.forEach(list::add);
        return list.toString();
    }
}
