package com.vplus.demo.userservice.controller;

import com.vplus.demo.userservice.service.UserService;
import com.vplus.demo.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Integer id) {
        System.out.println(123);
        return this.userService.findById(id);
    }

    @GetMapping("/insert")
    public void insert() {
        System.out.println(123);
        User user=new User();
        user.setAge(12);
        user.setId(3);
        user.setName("name3");

        this.userService.save(user);
    }

    @GetMapping("/age/{ag}")
    public User findByAge(@PathVariable("ag") Integer ag) {
        System.out.println(ag);
        return this.userService.selectUserByAge(ag);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        //直接调用addUserService中的addDataProject方法，将user实体传入
        this.userService.save(user);
    }


}
