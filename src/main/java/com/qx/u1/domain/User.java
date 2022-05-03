package com.qx.u1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String uid;
    private String name;
    private String gender;
    private String mobile;
}
