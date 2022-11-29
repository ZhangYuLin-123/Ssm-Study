package org.example.controller;


import org.example.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
    @Autowired
    private MyService myService;


    @RequestMapping("/test")
    public String test(){
        myService.show1();
        return "index";
    }
}
