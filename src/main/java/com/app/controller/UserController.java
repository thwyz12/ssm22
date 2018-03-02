package com.app.controller;

import com.app.model.User;
import com.app.service.IUserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wyz on 2018/3/2.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String list(){
        System.out.println(1);
        User use = userService.selectUserById(1);
        System.out.println(use.getLoginName());
        return "[{name:1}]";

    }
}
