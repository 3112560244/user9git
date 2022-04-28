package com.qx.controller;

import com.qx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.soap.Addressing;
import java.util.*;

@Controller
@RequestMapping(value = "/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService empService;

    @ModelAttribute
    public void findAllDepts(Model model){
        Map<Boolean,String> genderMap = new HashMap<>();
        genderMap.put(true,"男");
        genderMap.put(false,"女");
        model.addAttribute("genderMap",genderMap);

        List<String> allHobby = new ArrayList<>();
        allHobby.add("运动");
        allHobby.add("旅游");
        allHobby.add("游戏");
        allHobby.add("娱乐");
        allHobby.add("编程");
        model.addAttribute("allHobby",allHobby);

        List<String> allDepts = new ArrayList<>();
        allDepts.add("java开发部门");
        allDepts.add("c开发部门");
        allDepts.add("AI开发部门");
        allDepts.add("人工智能开发部门");
        model.addAttribute("depts",allDepts);

        List<String> qualifications = new ArrayList<>();
        qualifications.add("高中");
        qualifications.add("专科");
        qualifications.add("本科");
        qualifications.add("硕士");
        qualifications.add("博士");
        model.addAttribute("qualifications",qualifications);

        Set<String> roles = new HashSet<>();
        roles.add("软件工程师");
        roles.add("系统架构师");
        roles.add("项目经理");
        roles.add("人事经理");
        model.addAttribute("roles",roles);


    }





}

