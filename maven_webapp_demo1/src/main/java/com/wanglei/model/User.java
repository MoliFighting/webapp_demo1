package com.wanglei.model;

import java.util.List;

/**
 * Created by wanglei on 16/7/28.
 */
public class User {
    private int id;
    private String nickname;
    private String password;
    private String first_name;
    private String last_name;
    private List<Visit> visitList;


    public List<Visit> getVisitList() {
        return visitList;
    }

    public void setVisitList(List<Visit> visitList) {
        this.visitList = visitList;
    }


    public User() {
        super();
    }

    public User(String nickname, String password) {
        super();
        this.nickname = nickname;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }
}
