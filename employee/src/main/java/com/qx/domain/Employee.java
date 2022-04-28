package com.qx.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String empId;
    private String name;
    private boolean gender = true;
    private String[] hobby;
    private String dept;
    private List<String> roles;
    private String qualification;
    private String resume;

}
