package com.zhan.knife4j.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.zhan.knife4j.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhan
 * @since 2020-12-29 17:40
 */
@ApiSupport(author = "zhan")
@RestController
@Api(tags = "用戶模块")
public class UserController {

    @ApiOperationSupport(order = 10)
    @ApiOperation(value = "新增用户接口")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }

    @ApiOperation(value = "根据ID查找用户")
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }

    @ApiOperation("更新用户")
    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }

    @ApiOperation("删除用户")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }

    @ApiOperationSupport(author = "泷泽萝拉",order = 1)
    @ApiOperation("test文档接口测试")
    @GetMapping("/test")
    public String test(String name) {
        return name + " knife4 测试";
    }
}
