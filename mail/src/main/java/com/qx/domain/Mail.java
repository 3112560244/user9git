package com.qx.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mail {
    @NotEmpty(message = "邮件地址不能为空！")
    @Email(message = "邮件地址格式不对")
    private String mailName;

    @NotEmpty(message = "登陆密码不能为空！")
    @Length(min = 8,max = 16)
    private String mailPwd;



}
