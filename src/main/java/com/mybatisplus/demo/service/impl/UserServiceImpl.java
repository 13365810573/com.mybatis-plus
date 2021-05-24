package com.mybatisplus.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatisplus.demo.bean.User;
import com.mybatisplus.demo.mapper.UserMapper;
import com.mybatisplus.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-05-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User getUserId(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
