package com.itheima.mybatis.mapper;

import com.itheima.mybatis.pojo.QueryVo;
import com.itheima.mybatis.pojo.User;

import java.util.List;

/**
 * Created by daviddai on 2017/8/8.
 */
public interface UserMapper {
    /**
     * 模糊查询
     * @param vo
     * @return
     */
    List<User> findUserByQueryVo(QueryVo vo);

    /**
     * 获取用户列表总数
     * @return
     */
    int findUserCount();

    List<User> findUserList(User user);

    List<User> findUserListByQueryVo(QueryVo vo);

    void updateByIF(User user);

    List<User> findUserOrdersListResultMap();
}
