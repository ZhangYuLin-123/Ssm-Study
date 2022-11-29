package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TargetController2 {
    @RequestMapping("/t2")
    public void target2(){
        System.out.println("in controller function:target2!");
        /*ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "kangkang1");
        modelAndView.setViewName("index");
        return modelAndView;*/
    }

}
