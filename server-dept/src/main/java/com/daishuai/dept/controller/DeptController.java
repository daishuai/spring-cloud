package com.daishuai.dept.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author admin
 * @version 1.0.0
 * @description 用户接口
 * @createTime 2022-10-23 11:53:36
 */
@RestController
@RequestMapping(value = "/")
public class DeptController {

    @GetMapping(value = "/queryDept")
    public Map<String, Object> queryDept() {
        Map<String, Object> userInfo = new HashMap<>();
        userInfo.put("name", "公安部");
        userInfo.put("address", "江苏省苏州市相城区");
        return userInfo;
    }
}
