package com.hfy.example.controller;

import com.hfy.example.bean.User;
import com.hfy.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/user/")
@Controller
public class UserInfo {

    @Resource
    UserService userService;

    @RequestMapping("listAllUser.do")
    public String listAllUser(ModelMap modelMap){

        List<User> listUser = userService.listAllUser();
        System.out.println(listUser.size());
        modelMap.addAttribute("listUser",listUser);
        return "user/listUser";
    }
}
