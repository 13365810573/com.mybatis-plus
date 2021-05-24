package com.mybatisplus.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2021-05-248:46
 */
@Data
@TableName("User")
public class User {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
