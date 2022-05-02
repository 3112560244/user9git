package com.qx.controller;

import com.qx.domain.User;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addForm(Model model){
        model.addAttribute("user",new User());
        Map<Boolean,String > map = new HashMap<>();
        map.put(false,"男");
        map.put(true,"女");
        model.addAttribute("sexMap",map);
        return "add";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addUser(User user,Model model){
        model.addAttribute("user",user);
        model.addAttribute("info","添加新用户成功");
        return "info";
    }



}
