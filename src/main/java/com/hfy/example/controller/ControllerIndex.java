package com.hfy.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test/")
public class ControllerIndex {

    @RequestMapping("index.do")
    @ResponseBody
    public String index(){
        return "Hello World!";
    }
}
