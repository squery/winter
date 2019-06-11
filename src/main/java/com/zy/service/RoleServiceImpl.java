package com.zy.service;

import com.zy.dao.RoleMapper;
import com.zy.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by squery on 2017/4/26.
 */
@Service
public class RoleServiceImpl implements  RoleService {
    @Autowired
    private RoleMapper mRoleMapper;

    @Override
    public Role selectByPrimaryKey(int id) {
        return mRoleMapper.selectByPrimaryKey(id);
    }
}
