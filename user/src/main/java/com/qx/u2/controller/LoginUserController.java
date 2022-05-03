package com.qx.u2.controller;

import com.qx.u2.domain.LoginUser;
import com.qx.u2.validator.LoginUserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginUserController {

    @Autowired
    private LoginUserValidator loginUserValidator;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginForm(Model model){
        model.addAttribute("loginUser",new LoginUser());
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(LoginUser loginUser,Model model,Errors errors){
        model.addAttribute("loginUser",loginUser);
        loginUserValidator.validate(loginUser, errors);
        if(errors.hasErrors()){
            return "login";
        }
        return "msg";
    }

}
