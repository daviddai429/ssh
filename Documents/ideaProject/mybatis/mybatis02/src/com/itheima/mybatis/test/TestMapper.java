package com.itheima.mybatis.test;

import com.itheima.mybatis.mapper.OrdersMapper;
import com.itheima.mybatis.mapper.UserMapper;
import com.itheima.mybatis.pojo.OrderCustom;
import com.itheima.mybatis.pojo.Orders;
import com.itheima.mybatis.pojo.QueryVo;
import com.itheima.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daviddai on 2017/8/8.
 */
public class TestMapper {
    private SqlSessionFactory sqlSessionFactory;

    //获取sqlSessionFaction
    @Before
    public void setSqlSessionFactory() throws Exception {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream stream = Resources.getResourceAsStream("mybatis/SqlMapConfig.xml");
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(stream);
    }

    @Test
    public void test1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("wang");
        vo.setUser(user);
        List<User> userList = userMapper.findUserByQueryVo(vo);
        System.out.println(userList);
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int count = userMapper.findUserCount();
        System.out.println(count);
        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
        List<Orders> ordersList = ordersMapper.getOrdersList();
        System.out.println(ordersList);
        sqlSession.close();
    }

    @Test
    public void test4() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        //参数1
        user.setUsername("g");
        //参数2
        //user.setId(1);
        List<User> users = userMapper.findUserList(user);
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void test5() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        vo.setIds(list);
        List<User> userList = userMapper.findUserListByQueryVo(vo);
        sqlSession.close();
    }

    @Test
    public void test6() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setSex("1");
        user.setId(1);
        userMapper.updateByIF(user);
        //提交
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test7() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
        List<Orders> ordersList = ordersMapper.findOrdersList();
        sqlSession.close();
    }

    @Test
    public void test8() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userOrdersListResultMap = userMapper.findUserOrdersListResultMap();
        sqlSession.close();
    }
}