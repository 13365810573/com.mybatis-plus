package com.mybatisplus.demo.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2021-05-2415:10
 */
@Data
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;

    public static  Result succ(Object data){
        return succ(200,"操作成功",data);
    }

    public static  Result succ(int code, String msg ,Object data){
        Result r = new Result();
        r.setCode(200);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static  Result fail(Object data){
        return succ(400,"操作成功",null);
    }

    public static  Result fail(int code, String msg ,Object data){
        Result r = new Result();
        r.setCode(400);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
