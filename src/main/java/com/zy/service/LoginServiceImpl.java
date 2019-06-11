package com.zy.service;


import java.util.HashMap;

import com.google.gson.Gson;
import com.zy.dto.DevConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ${ZY}[Squery] on 2016/10/18.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private DevConfig mDevConfig;

    @Override
    public Object retDemo(String zy, String name) {
        System.err.println(zy + "----" + name);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("zy", zy+":::::"+mDevConfig.getHost()+":::::"+mDevConfig.getPort());
        map.put("name", name);
        return new Gson().toJson(map);
    }


}
