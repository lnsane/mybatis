package com.domain;


public class UserModel {
    private Integer id;

    /**
    * 名字
    */
    private String user;

    public UserModel() {
    }

    public UserModel(Integer id, String user) {
        this.id = id;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                '}';
    }
}
