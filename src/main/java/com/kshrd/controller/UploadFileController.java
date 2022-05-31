package com.kshrd.controller;

import com.kshrd.service.UploadFileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadFileController {

    @Value("${image.url}")
    private String imageUrl;

    private final UploadFileService uploadFileService;

    public UploadFileController(UploadFileService uploadFileService) {
        this.uploadFileService = uploadFileService;
    }

    @PostMapping("/upload")
    public String upLoadImage(@RequestParam("image") MultipartFile file){
        try{
            String url = imageUrl + uploadFileService.saveFile(file);
            System.out.println("url:" + url);
        }catch (Exception ex){
            System.out.println("upLoadImage Error:" + ex.getMessage());
        }
        return url;
    }

}
