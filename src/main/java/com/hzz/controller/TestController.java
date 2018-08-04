package com.hzz.controller;

import com.hzz.mapper.test1.UserMapper;
import com.hzz.mapper.test2.CountMapper;
import com.hzz.po.Count;
import com.hzz.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private CountMapper countMapper;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(path = "/counts",method = {RequestMethod.GET})
    public List<Count> getCountList(){
        return countMapper.getCountList();
    }

    @RequestMapping(path = "/users",method = {RequestMethod.GET})
    public List<User> getUserList(){
        return userMapper.getUserList();
    }


}
