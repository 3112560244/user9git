package com.qx.u1.service;

import com.qx.u1.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//hello
@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        System.out.println("addUser");
        users.add(user);
    }

    public List<User> findAllUsers() {
        return users;
    }

    public User findById(String uid) {
        User user = null;
        for (User user1 : users) {
            if (user1.getUid().equals(uid)) {
                user = user1;
                break;
            }
        }
        return user;

    }


    public void update(User user) {
        for (User user1 : users) {
            if (user1.getUid().equals(user.getUid())) {
                user1.setName(user.getName());
                user1.setGender(user.getGender());
                user1.setMobile(user.getMobile());
                break;
            }
        }
    }

    public void delete(String uid) {
        for (User user1 : users) {
            if (user1.getUid().equals(uid)) {
                users.remove(user1);
                break;
            }
        }
    }


}
