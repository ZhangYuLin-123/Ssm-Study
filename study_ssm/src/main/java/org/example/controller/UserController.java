package org.example.controller;

import org.apache.log4j.Logger;
import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger logger= Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/queryList")
    @ResponseBody
    public String findAll(){
        logger.info("------find all user-----");
        return userService.queryList().toString();
    }
}
