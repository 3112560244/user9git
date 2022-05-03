package com.qx.u1.controller;

import com.qx.u1.domain.User;
import com.qx.u1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping(value = "/index")
    public String index(Model model) {
        List<User> list = userService.findAllUsers();
        model.addAttribute("users", list);
        System.out.println("2");
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user, Map<String, Object> map) {
        System.out.println(user);
        userService.addUser(user);
        map.put("users", userService.findAllUsers());
        return "index";
    }

    //    @RequestMapping(value = "/update",method = RequestMethod.GET)
//    public String update(String uid,Model model){
//        model.addAttribute("user",userService.findById(uid));
//        return "update";
//    }
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update(String uid, Map<String, Object> map) {
        map.put("user", userService.findById(uid));
        return "update";
    }

//    @RequestMapping(value = "/update",method = RequestMethod.POST)
//    public String update(User user,Model model){
//        userService.update(user);
//        System.out.println(user+"update");
//        model.addAttribute("users",userService.findAllUsers());
//        return "index";
//    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user, Map<String, Object> map) {
        userService.update(user);
        System.out.println(user + "update");
        map.put("users", userService.findAllUsers());
        return "index";
    }


    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(String uid, Map<String, Object> map) {
        userService.delete(uid);
        System.out.println(uid + "delete");
        map.put("users", userService.findAllUsers());
        return "index";
    }

}
