package com.itheima.mybatis.mapper;

import com.itheima.mybatis.pojo.OrderCustom;
import com.itheima.mybatis.pojo.Orders;
import com.itheima.mybatis.pojo.QueryVo;
import com.itheima.mybatis.pojo.User;

import java.util.List;

/**
 * Created by daviddai on 2017/8/8.
 */
public interface OrdersMapper {
    //查找所有订单
    List<Orders> getOrdersList();
    //关联查询
    List<Orders> findOrdersList();
}
