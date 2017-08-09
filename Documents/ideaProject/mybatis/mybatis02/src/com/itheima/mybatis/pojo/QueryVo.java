package com.itheima.mybatis.pojo;

import java.util.List;

/**
 * Created by daviddai on 2017/8/8.
 */
public class QueryVo {
    private User user;//用户
    private List<Integer> ids;//用于接收多个id

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
