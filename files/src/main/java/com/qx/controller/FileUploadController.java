package com.qx.controller;

import com.qx.domain.FileUploadManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/upload")
public class FileUploadController {

    @RequestMapping("/file")
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

    @RequestMapping("/files")
    public String uploads(){
        return "uploads";
    }
    //多文件上传
    @RequestMapping(value = "/more")
    public String moreFileUpload(@RequestParam("uploadFiles") List<MultipartFile> uploadFiles, @RequestParam("fileDesc") List<String> fileDesc, HttpServletRequest request, Map<String,Object> map){
        String realPath = request.getServletContext().getRealPath("uploadFiles");
        File targetDir = new File(realPath);

        if(!targetDir.mkdirs()){
            targetDir.mkdirs();
        }
        System.out.println(targetDir.getAbsolutePath());

        if(!uploadFiles.isEmpty()&&uploadFiles.size()>0){
            map.put("uploadFiles",uploadFiles);
            map.put("fileDesc",fileDesc);
            for(MultipartFile file:uploadFiles){
                String fileName = file.getOriginalFilename();
                try {
                    file.transferTo(new File(targetDir,fileName));

                }catch (Exception e){
                    System.out.println("文件上传失败！");
                    e.printStackTrace();
                    return "error";
                }
            }
            return "success2";
        }else {
            return "error";
        }

    }


}
