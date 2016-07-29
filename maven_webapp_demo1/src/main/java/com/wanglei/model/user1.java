package com.wanglei.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wanglei on 16/7/28.
 */
public class user1 {
    private String name="wanglei";
    private int age=20;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        System.out.print("hehhehehe");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.print("wuwuwuw");
        user1 user2 = ctx.getBean("user1",user1.class);
        System.out.print(user2.getAge() + user2.getName());
    }
}
