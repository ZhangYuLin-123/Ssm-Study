package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class TargetController {
    @RequestMapping("/target")
    public String target(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("in controller function:target!");

        //采用原生servlet实现
        /*request.getRequestDispatcher("/t2").forward(request, response);
        System.out.println("after forward");
        return;*/

        //采用框架实现
        return "forward:/t2";

        /*ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "kangkang1");
        modelAndView.setViewName("index");
        return modelAndView;*/
    }

}
