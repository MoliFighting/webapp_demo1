package com.wanglei.controller;

import com.wanglei.model.user1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wanglei on 16/7/28.
 */

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model){
        model.addAttribute("message","Hello World");
        model.put("content","this is my first controller,i put content to hello.jsp");
        return "hello";
    }

    @RequestMapping(value = "/{name}/{age}",method = RequestMethod.GET)
    public String getParametersByUrl(ModelMap model, @PathVariable("name") String name, @PathVariable("age") int age){
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "hello";
    }

    @RequestMapping(value = "/infoget",method = RequestMethod.GET)
    public String getParametersByGet(ModelMap model, @RequestParam String name,@RequestParam int age ){
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "hello";
    }

    @RequestMapping(value = "/infopost",method = RequestMethod.POST)
    public  String getParameterByPost(ModelMap model, @RequestParam String name,@RequestParam int age){
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "hello";
    }

    @RequestMapping(value = "/springform",method = RequestMethod.GET)
    public String getParameterBySprintForm(ModelMap model){
        user1 u1 = new user1();
        model.addAttribute("user",u1);
        return "info";
    }
}

