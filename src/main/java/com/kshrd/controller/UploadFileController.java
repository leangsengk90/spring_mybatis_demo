package com.kshrd.controller;

import com.kshrd.payload.response.UploadImageRes;
import com.kshrd.service.UploadFileService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@SecurityRequirement(name = "uploadFileController") //for swagger
public class UploadFileController {

    private final UploadFileService uploadFileService;

    public UploadFileController(UploadFileService uploadFileService) {
        this.uploadFileService = uploadFileService;
    }

//    @PostMapping(value = "/upload", consumes = {"multipart/form-data"})
    @PostMapping(value = "/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public String upLoadImage(@RequestParam("image") MultipartFile file){
        String url = "";
        try{
            url = uploadFileService.saveFile(file);
            System.out.println("url:" + url);
        }catch (Exception ex){
            System.out.println("upLoadImage Error:" + ex.getMessage());
        }
        return url;
    }

    @PostMapping(value = "/upload2", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public List<String> upLoadImage2(@RequestParam("file") MultipartFile[] files) {
        List urlList = new ArrayList();
        try {
            urlList = uploadFileService.saveFile2(files);
            System.out.println("urlList:" + urlList);
        } catch (Exception ex) {
            System.out.println("upLoadImage Error:" + ex.getMessage());
        }
        for(Object item: urlList){
            System.out.println("Object item: " + item );
        }
        return urlList;
    }
}
