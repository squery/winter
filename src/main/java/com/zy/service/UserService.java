package com.zy.service;

import com.zy.model.User;

/**
 * Created by ${ZY}[Squery] on 2016/10/31.
 */
public interface UserService {

    User selectByPrimaryKey(int id);

    User selectUserRoles(int id);


}
