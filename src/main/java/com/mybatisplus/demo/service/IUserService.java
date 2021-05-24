package com.mybatisplus.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.mybatisplus.demo.bean.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2021-05-24
 */
public interface IUserService extends IService<User> {

    User getUserId(Integer id);
}
