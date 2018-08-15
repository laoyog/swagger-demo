package com.alibaba.controller;

import com.alibaba.bean.Result;
import com.alibaba.bean.User;
import com.alibaba.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("用户模块接口")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查看所有用户")
    @RequestMapping(value = "/user/findAll",method = RequestMethod.GET)
    public Result findAll(){
        return userService.findAll();
    }

    @ApiOperation(value = "添加用户")
    @RequestMapping(value = "/user/addOne",method = RequestMethod.POST)
    public Result addOne(@RequestBody User user){
        return userService.addOne(user);
    }

    @ApiOperation(value = "修改用户")
    @RequestMapping(value = "/user/update",method = RequestMethod.POST)
    public Result update(@RequestBody User user){
        return userService.update(user);
    }

    @ApiOperation(value = "删除用户")
    @RequestMapping(value = "/user/delete",method = RequestMethod.POST)
    public Result delete(@RequestBody User user){
        return userService.delete(user);
    }

}
