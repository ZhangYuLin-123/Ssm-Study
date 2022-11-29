package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.domain.User;
import org.example.domain.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@Controller
public class UserController {

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String save(){
        System.out.println("UserController save....");
        return "success.jsp";
    }

    @RequestMapping("/save2")
    public ModelAndView save2(){
        /*
        Model:模型 作用封装数据
        View:视图 作用展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "kangkang2");
        modelAndView.setViewName("success2.jsp");
        return modelAndView;
    }


    @RequestMapping("/save3")
    public ModelAndView save3(ModelAndView modelAndView){
        modelAndView.addObject("name", "kangkang3");
        modelAndView.setViewName("success2.jsp");
        return modelAndView;
    }

    @RequestMapping("/save4")
    public String save4(Model model){
        model.addAttribute("name", "kangkang4");
        return "success2.jsp";
    }

    @RequestMapping("/save5")
    public String save5(HttpServletRequest request){
        request.setAttribute("name", "kangkang5");
        return "success2.jsp";
    }


    @RequestMapping("/save6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("kangkang6");
    }


    @RequestMapping("/save7")
    @ResponseBody
    public String save7(){
        return "success";
    }

    @RequestMapping("/save8")
    @ResponseBody
    public String save8() throws JsonProcessingException {
        User user = new User();
        user.setName("kangkang");
        user.setAge(18);


        //使用json转换工具,需要用Maven导入相应依赖包
        ObjectMapper objectMapper = new ObjectMapper();
        String result = objectMapper.writeValueAsString(user);
        return result;
    }

    /**
     * spring-mvc.xml中配置RequestMappingHandlerAdapter，设置messageConverters
     * @return
     */
    @RequestMapping("/save9")
    @ResponseBody
    public User save9(){
        User user = new User();
        user.setName("kangkang9");
        user.setAge(99);

        return user;
    }


    /**
     * 不使用：spring-mvc.xml中配置RequestMappingHandlerAdapter
     * 在spring-mvc.xml中配置<mvc:annotation-driven/>
     * @return
     */
    @RequestMapping("/save10")
    @ResponseBody
    public User save10(){
        User user = new User();
        user.setName("kangkang10");
        user.setAge(100);

        return user;
    }

    /**
     * 接受数组类型参数
     * /param1?strs=123&strs=456&strs=789
     */
    @RequestMapping("/param1")
    @ResponseBody
    public void param1(String[] strs){

        System.out.println(Arrays.asList(strs));
    }


    /**
     * 接受表单集合参数
     */
    @RequestMapping("/param2")
    @ResponseBody
    public void param2(UserVO userVO){

        System.out.println(userVO.toString());
    }






}
