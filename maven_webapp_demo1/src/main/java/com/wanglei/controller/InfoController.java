package com.wanglei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wanglei on 16/7/28.
 */
@Controller
public class InfoController {
    @RequestMapping(value = "info")
    public String info(){
        return "info";
    }
}
