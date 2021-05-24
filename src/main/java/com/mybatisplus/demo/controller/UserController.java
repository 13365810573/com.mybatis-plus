package com.mybatisplus.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.demo.bean.User;
import com.mybatisplus.demo.mapper.UserMapper;
import com.mybatisplus.demo.service.impl.UserServiceImpl;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2021-05-248:59
 */
@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserServiceImpl userService;

    @GetMapping("/hello")
    public List<User> userList(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        List<Long> collect = userList.stream().map(k -> {
            Long id = k.getId();
            return id;
        }).collect(Collectors.toList());
        List<User> users = userService.listByIds(collect);



        System.out.println(users+"==================");
        Integer id = 1;
        User user =  userService.getUserId(id);
        user.setName("xiaohu");
        boolean b = userService.updateById(user);
        System.out.println(b);
        System.out.println(user);
        return userList;
    }
}
