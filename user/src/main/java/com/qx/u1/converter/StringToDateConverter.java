package com.qx.u1.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    private String datePattern;

    @Override
    public Date convert(String source) {
        if(source == null || "".equals(source.trim())){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        Date result = null;
        try{
            result = sdf.parse(source);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("日期格式转换失败！");
        }


        return result;
    }

    public String getDatePattern(){
        return datePattern;
    }

    public void setDatePattern(String datePattern){
        this.datePattern = datePattern;
    }



}
