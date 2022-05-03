package com.qx.u4.controller;

import com.qx.u4.domain.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addForm(Model model){
        model.addAttribute("customer",new Customer());
        Map<Boolean,String> sexMap = new HashMap<>();
        sexMap.put(true,"男");
        sexMap.put(false,"女");
        model.addAttribute("sexMap",sexMap);
        return "customer";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult,Model model){
        Map<Boolean,String> sexMap = new HashMap<>();
        sexMap.put(true,"男");
        sexMap.put(false,"女");
        System.out.println(customer);
        model.addAttribute("sexMap",sexMap);
        if(bindingResult.getFieldErrorCount()>0){
            return "customer";
        }

        model.addAttribute("customer",customer);
        return  "message";
    }
    

}
