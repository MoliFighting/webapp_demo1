package com.wanglei.controller;

/**
 * Created by wanglei on 16/7/28.
 */

 import com.wanglei.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
public class IndexController {
    @Resource
    UserService userService;

    @RequestMapping(value = "index")
    public String helloWorld(){
        return "index";
    }
}

