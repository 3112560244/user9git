package com.qx.controller;

import com.qx.domain.FileUploadManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
@RequestMapping(value = "/upload")
public class FileUploadController {

    @RequestMapping()
    public String simpler(){
        return "upload";
    }

    @RequestMapping(value = "/simple")
    public String simpleFileUpload(@ModelAttribute FileUploadManager fileUploadManager, HttpServletRequest request){
        String realPath = request.getServletContext().getRealPath("uploadFiles");
        System.out.println(realPath);

        System.out.println(fileUploadManager);

        if(!new File(realPath).exists()){
            new File(realPath).mkdirs();
        }
        String fileName = fileUploadManager.getUploadFile().getOriginalFilename();
        System.out.println("文件上传作者:"+fileUploadManager.getUploadFile().getContentType()+",上传文件的名称:"+fileName);
        System.out.println("上传文件的内容类型:"+fileUploadManager.getUploadFile().getContentType());
        System.out.println("上传文件的大小:"+fileUploadManager.getUploadFile().getSize());
        File targetFile = new File(realPath,fileName);
        try {
            fileUploadManager.getUploadFile().transferTo(targetFile);
        }catch (Exception e){
            System.out.println("文件上传失败!");
            e.printStackTrace();
        }
        return "success";
    }
}
