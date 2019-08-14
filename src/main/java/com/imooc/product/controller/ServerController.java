package com.imooc.product.controller;

/**
 * @Author 章鑫
 * @Date 2018/8/28 16:09
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 章鑫
 * @Project_name：product
 * @Name: TestController
 * @Create: 2018-08-28 16:09
 * @Description:
 **/
@RestController
public class ServerController {

    @GetMapping("/product/msg")
    public String msg() {
        return "这是一个测试功能";
    }
}
