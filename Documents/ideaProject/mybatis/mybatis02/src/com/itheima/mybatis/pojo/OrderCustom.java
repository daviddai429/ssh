package com.itheima.mybatis.pojo;

/**
 * Created by daviddai on 2017/8/8.
 */
public class OrderCustom extends Orders {
    private String username;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
