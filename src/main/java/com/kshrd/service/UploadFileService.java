package com.kshrd.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadFileService {
    public String saveFile(MultipartFile file) throws IOException;
}
