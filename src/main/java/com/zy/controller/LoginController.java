package com.zy.controller;

import com.zy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ${ZY}[Squery] on 2016/10/18.
 */
@Controller
@RequestMapping("/test")
public class LoginController {

    @Autowired
    private LoginService demo;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestParam("ztt") String zy, String name) {

        return demo.retDemo(zy, name);
    }
}
