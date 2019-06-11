package com.zy.controller;


import java.util.List;

import com.google.gson.Gson;
import com.zy.model.Role;
import com.zy.model.User;
import com.zy.service.RoleService;
import com.zy.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ${ZY}[Squery] on 2016/10/31.
 */
@Controller
@RequestMapping("/userController")
public class UserController {

    private static Logger sLogger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService mRoleService;

    @ResponseBody
    @RequestMapping(value = "/updateUserUI", method = RequestMethod.GET)
    public Object updateUserUI(int id) {
        sLogger.error("hahhahahhaha");
        return userService.selectByPrimaryKey(id);
    }

    @ResponseBody
    @RequestMapping(value = "/selectUserRolesUI", method = RequestMethod.GET)
    public Object selectUserAndRoles(int id) {
        User user = userService.selectUserRoles(id);
        List<Role> roles = user.getRoles();
        System.err.println(roles.size()+"TTTT"+roles.toString());
        return new Gson().toJson(roles);
    }

    @ResponseBody
    @RequestMapping(value = "/selectRolesUI", method = RequestMethod.GET)
    public Object selectRolesUI(int id) {
        return mRoleService.selectByPrimaryKey(id);
    }



}
