package com.qx.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private boolean gender;
    private Date birthday;
    private String mobile;

    public User(String name, boolean gender, Date birthday, String mobile) {

        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.mobile = mobile;
    }

}
