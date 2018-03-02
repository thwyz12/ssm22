package com.app.service;


import com.app.model.User;

/**
 * Created by wyz on 2018/3/2.
 */
public interface IUserService {
    User selectUserById(Integer id);
}
