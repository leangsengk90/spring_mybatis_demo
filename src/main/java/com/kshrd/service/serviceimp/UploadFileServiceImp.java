package com.kshrd.service.serviceimp;

import com.kshrd.service.UploadFileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class UploadFileServiceImp implements UploadFileService {

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

        return filename;
    }
}
