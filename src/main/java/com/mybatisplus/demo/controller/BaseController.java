package com.mybatisplus.demo.controller;

import com.mybatisplus.demo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2021-05-259:41
 */
public class BaseController {

    @Autowired
    HttpServletRequest request;

    @Autowired
    RedisUtil redisUtil;
}
