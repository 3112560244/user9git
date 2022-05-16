package com.qx.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

//@RestController(value ="/download" )
@Controller
@RequestMapping(value = "/download")
public class FileDownloadController {




    /**
     * TODO
     * @author  ZedQ
     * 功能：显示所有可供下载资源
     * @date   2022/5/6 10:29
     * @param request
     * @param model
     * @param response
     * @return      [javax.servlet.http.HttpServletRequest, org.springframework.ui.Model, javax.servlet.http.HttpServletResponse]
     * @Exception
     *
     */
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String showDownloadFiles(HttpServletRequest request, Model model, HttpServletResponse response){
        //设置下载目录
        String downloadPath = request.getServletContext().getRealPath("uploadFiles");
        System.out.println(downloadPath);

        File downloadFile = new File(downloadPath);

        List<String > fileNames = new ArrayList<>();
        File[] files = downloadFile.listFiles();
        if(files!=null)
        for(File f:files){
            fileNames.add(f.getName());
        }

        model.addAttribute("fileNames",fileNames);
        return  "shows";

    }

    /**
     * TODO
     * @author  ZedQ
     * 功能：
     * @date   2022/5/6 10:31
     * @param fileName
     * @param request
     * @return      [java.lang.String, javax.servlet.http.HttpServletRequest]
     * @Exception
     *
     */
    @RequestMapping(value = "/down")
    public ResponseEntity<byte[]> downloadFile(@RequestParam(value = "filename") String fileName,HttpServletRequest request)throws IOException{
        String path = request.getServletContext().getRealPath("uploadFiles");
        System.out.println(path);
        System.out.println("***************");
        System.out.println(fileName);

        File file = new File(path+File.separator+fileName);
        if(!file.exists()){
            File[] files = new File(path).listFiles();
            for(File f:files){
                if(f.getName().contains(fileName)){
                    file  = f;
                    fileName = f.getName();
                    break;
                }
            }
        }
        fileName = this.getFileName(request,fileName);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment",fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);

    }

    /**
     * TODO
     * @author  ZedQ
     * 功能：
     * @date   2022/5/6 11:10 
     * @param
     * @return
     * @Exception   
     * 
     */
    private String getFileName(HttpServletRequest request,String fileName)throws UnsupportedEncodingException{
        String[] IEBrowserKeyWords = {"MSIE","Trident","Edge"};

        String userAgent = request.getHeader("User-Agent");

        System.out.println(userAgent);
        for(String keyWord:IEBrowserKeyWords){
            if(userAgent.contains(keyWord)){
                return URLEncoder.encode(fileName,"UTF-8");
            }
        }

        return new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
    }




}
