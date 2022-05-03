package com.qx.u4.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @NotBlank(message = "登录名不能为空")
    @Length(min = 8,max = 12,message = "登录名称字符长度必须为8-12位")
    private String loginName;

    @NotBlank(message = "密码不能为空")
    @Length(min = 6,max = 12,message = "密码的字符长度必须为6-12位")
    private String loginPwd;

    private Boolean sex = true;


    @Range(min = 15, max = 70,message = "客户的年龄必须为15-70岁")
    private int age;

    @NotBlank(message = "E-mail 地址不能为空")
    @Email(message = "E-mail 格式不正确")
    private String email;


    @NotNull(message = "生日不能为空")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "客户的生日必须是一个过去的时间")
    private Date birthday;

    @NotBlank(message = "客户的联系电话不能为空")
    @Pattern(regexp = "[1][3,5,7,8][0-9]{8}",message = "无效的电话号码")
    private String phone;







}
