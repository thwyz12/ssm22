package com.app.dao;

import com.app.model.User;

/**
 * Created by wyz on 2018/3/2.
 */
public interface IUserDao {
    User selectUserById(Integer id);
}
