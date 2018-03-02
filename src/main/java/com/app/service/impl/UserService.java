package com.app.service.impl;

import com.app.dao.IUserDao;
import com.app.model.User;
import com.app.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by wyz on 2018/3/2.
 */
@Service
public class UserService implements IUserService{

    @Autowired
    private IUserDao userDao;
    public User selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }
}
