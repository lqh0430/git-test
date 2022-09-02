package com.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author LQH02
 * @Description
 * @CreateDate 2022/9/2 17:42
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping
    public String hello() {
        System.out.println("测试linux部署项目(手动jar)");

        return "部署成功";
    }
}
