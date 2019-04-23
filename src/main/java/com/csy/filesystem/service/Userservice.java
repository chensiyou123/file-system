package com.csy.filesystem.service;

import com.csy.filesystem.bean.RespBean;
import com.csy.filesystem.bean.User;
import com.csy.filesystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {
    @Autowired
    UserMapper userMapper;
    public List<User> query(java.util.Map map){
        List<User>users = userMapper.query(map);
        return users;
    }
    public RespBean delete(Long id){
        userMapper.delete(id);
        return new RespBean("success","删除成功");
    }
}
