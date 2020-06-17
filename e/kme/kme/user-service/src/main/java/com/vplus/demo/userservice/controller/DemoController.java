package com.vplus.demo.userservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
    @RequestMapping("/demo1")
    public String demo() {
        System.out.println("进入controller中的demo方法！");
        //如果不在appliation.yml文件中添加前后缀信息，此处返回语句为
        //return "html/myPage.html"
        return "myPage";
    }
    @RequestMapping("/demo2")
    public String demo2() {
        System.out.println("进入controller中的demo方法！");
        //如果不在appliation.yml文件中添加前后缀信息，此处返回语句为
        //return "html/myPage.html"
        return "doc";
    }

}
