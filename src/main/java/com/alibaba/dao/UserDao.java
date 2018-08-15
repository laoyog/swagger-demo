package com.alibaba.dao;

import com.alibaba.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author : chuangu
 * @Date : 2018/8/14 0014
 * @Desoription :
 */
@Mapper
public interface UserDao {

    @Select("select * from t_user")
    List<User> findAll();

    @Insert("insert into t_user values(#{id},#{name},#{type},#{time}) ")
    void addOne(User user);

    @Update("update t_user set name = #{name},type=#{type},time=#{time} where id = #{id}")
    void update(User user);

    @Delete("delete from t_user where id = #{id}")
    void delete(User user);
}
