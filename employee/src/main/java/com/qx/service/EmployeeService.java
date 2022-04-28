package com.qx.service;

import com.qx.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private static List<Employee> empDB = new ArrayList<>();
    public void addEmp(Employee emp){
        empDB.add(emp);
    }

    public Employee findById(String empId){
        Employee result = null;
        for(Employee emp:empDB){
            if(emp.getEmpId().equals(empId)){
                result = emp;
                break;
            }
        }
        return result;
    }

    public List<Employee> findAll(){
        return empDB;
    }



}
