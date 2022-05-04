package com.qx.controller;

import com.qx.domain.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "/mail")
public class MailController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){
        System.out.println("请求显示邮箱登陆界面");
        model.addAttribute("mail",new Mail());
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute("mail") Mail mail, BindingResult result, Model model, HttpSession session){
        if(result.hasErrors()){
            System.out.println("表单效验失败");
            return "login";
        }

        if("qx@163.com".equals(mail.getMailName()) && "12345678".equals(mail.getMailPwd())){
            session.setAttribute("mail",mail);
            return "main";
        }else{
            System.out.println("邮箱地址或密码错误!");
            model.addAttribute("error","邮箱地址或密码错误");
            return "login";
        }



    }


    @RequestMapping(value = "/send")
    public String send(){
        System.out.println("发送邮件！");
        return "send";
    }

    @RequestMapping(value = "/receive")
    public String receive(){
        System.out.println("接受邮件");
        return "receive";
    }


    @RequestMapping(value = "/main")
    public String main(){
        System.out.println("邮箱主页面");
        return  "main";
    }

}
