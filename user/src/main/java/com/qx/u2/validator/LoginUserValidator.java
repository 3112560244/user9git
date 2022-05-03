package com.qx.u2.validator;


import com.qx.u2.domain.LoginUser;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class LoginUserValidator implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {

        return LoginUser.class.isAssignableFrom(clazz);


    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginUser loginUser = (LoginUser) target;
        if(loginUser.getUserName() == null ||loginUser.getUserName().trim().isEmpty()) {
            errors.rejectValue("userName", "loginUser.userName.required");
        }

        if(loginUser.getPassword() == null ||loginUser.getPassword().trim().isEmpty()) {
            errors.rejectValue("password", null,"用户登陆密码不能为空");
        }

        if(loginUser.getUserName()!=null &&!"".equals(loginUser.getUserName())){
            int len = loginUser.getUserName().trim().length();
            System.out.println(loginUser.getUserName()+",len="+len);
            if(len<6||len>12){
                errors.rejectValue("userName","loginUser.userName.invalid");
            }
        }

        if(loginUser.getPassword()==null||loginUser.getPassword().trim().isEmpty()){
            int len = loginUser.getUserName().trim().length();
            System.out.println(loginUser.getUserName()+",len="+len);
            if(len<6 || len>12){
                errors.rejectValue("userName","loginUser.userName.invalid");
            }
        }

        if(loginUser.getPassword()!=null && !"".equals(loginUser.getPassword().trim())){
            int len = loginUser.getPassword().trim().length();
            if(len<6){
                errors.rejectValue("password",null,"用户的登陆密码必须大于等于6位");
            }
        }


    }
}
