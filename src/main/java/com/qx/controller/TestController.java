package com.qx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpSession session){
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        if("admin".equals(name) && "admin".equals(pwd)){
            session.setAttribute("name",name);
            request.setAttribute("msg","登陆成功");
        }else{
            request.setAttribute("msg","登陆失败");
        }

        return "info";
    }



}
