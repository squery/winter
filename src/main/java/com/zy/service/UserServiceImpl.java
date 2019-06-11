package com.zy.service;

import com.zy.dao.UserMapper;
import com.zy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ${ZY}[Squery] on 2016/10/31.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User selectUserRoles(int id) {
        return userMapper.selectUserRoles(id);
    }
}
