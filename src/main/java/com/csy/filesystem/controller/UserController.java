package com.csy.filesystem.controller;

import com.csy.filesystem.bean.RespBean;
import com.csy.filesystem.bean.User;
import com.csy.filesystem.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    Userservice userservice;
    @GetMapping
    public List<User>query(String keywords){
        java.util.Map map = new HashMap();
        List<User>users = userservice.query(map);
        return users;
    }

    @DeleteMapping(value = "{id}")
    public RespBean delete(@PathVariable Long id){
        return userservice.delete(id);
    }
}
