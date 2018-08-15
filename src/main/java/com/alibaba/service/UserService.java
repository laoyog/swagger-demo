package com.alibaba.service;

import com.alibaba.bean.Result;
import com.alibaba.bean.User;
import com.alibaba.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : chuangu
 * @Date : 2018/8/14 0014
 * @Desoription :
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Result findAll() {
        try {
            List<User> list = userDao.findAll();
            if(list.size() > 0){
                return new Result(true,"200","查询成功",list);
            }
            return new Result(false,"400","查询结果为空",null);
        } catch (Exception e) {
            return new Result(false,"400","查询失败",null);
        }

    }

    public Result addOne(User user) {
        try {
            userDao.addOne(user);
            return new Result(false,"400","添加成功",null);
        } catch (Exception e) {
            return new Result(false,"400","添加失败",null);
        }
    }
    public Result update(User user) {
        try {
            userDao.update(user);
            return new Result(false,"400","更新成功",null);
        } catch (Exception e) {
            return new Result(false,"400","更新失败",null);
        }
    }
    public Result delete(User user) {
        try {
            userDao.delete(user);
            return new Result(false,"400","删除成功",null);
        } catch (Exception e) {
            return new Result(false,"400","删除失败",null);
        }
    }
}
