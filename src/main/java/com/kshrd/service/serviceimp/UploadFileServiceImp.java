package com.kshrd.service.serviceimp;

import com.kshrd.payload.response.UploadImageRes;
import com.kshrd.service.UploadFileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class UploadFileServiceImp implements UploadFileService {

    @Value("${image.url}")
    private String imageUrl;

    Path path;
    public UploadFileServiceImp(){
        path = Paths.get("src/main/resources/images");
    }

    @Override
    public String saveFile(MultipartFile file) throws IOException {

        String filename = file.getOriginalFilename();
        System.out.println("filename: " + filename);
        String[] fileParts = filename.split("\\.");
        String extension = fileParts[fileParts.length - 1];
        System.out.println("extension: " + extension);

        filename = UUID.randomUUID() + "." +  extension;
        Path resolvePath = path.resolve(filename);
        Files.copy(file.getInputStream(), resolvePath, StandardCopyOption.REPLACE_EXISTING);

        return imageUrl + filename;
    }

//    @Override
//    public List<UploadImageRes> saveFile2(List<MultipartFile> fileList) throws IOException {
//        List urlList = new ArrayList();
//        File file = new File("src/main/resources/images");
//        if(!file.exists()){
//            file.mkdir();
//        }
//        for (MultipartFile multipartFile: fileList){
//            if(multipartFile.isEmpty()){
//                continue;
//            }
//            byte[] bytes = multipartFile.getBytes();
//            Path path = Paths.get("src/main/resources/images" + multipartFile.getOriginalFilename());
//            Files.write(path, bytes);
//        }
//        return urlList;
//    }

    @Override
    public List<String> saveFile2(MultipartFile[] fileList) throws IOException {
        List urlList = new ArrayList();

        for(MultipartFile multipartFile: fileList){
            String filename = multipartFile.getOriginalFilename();
            System.out.println("filename: " + filename);
            String[] fileParts = filename.split("\\.");
            String extension = fileParts[fileParts.length - 1];
            System.out.println("extension: " + extension);

            filename = UUID.randomUUID() + "." +  extension;
            urlList.add(imageUrl + filename);
            Path resolvePath = path.resolve(filename);
            Files.copy(multipartFile.getInputStream(), resolvePath, StandardCopyOption.REPLACE_EXISTING);
        }
        return urlList;
    }
}
