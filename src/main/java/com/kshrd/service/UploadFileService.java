package com.kshrd.service;

import com.kshrd.payload.response.UploadImageRes;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UploadFileService {
    public String saveFile(MultipartFile file) throws IOException;
    public List<String> saveFile2(MultipartFile[] fileList) throws IOException;
}
