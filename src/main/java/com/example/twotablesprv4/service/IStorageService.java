package com.example.twotablesprv4.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IStorageService {

    String uploadImage(MultipartFile file) throws IOException;

    byte[] downloadImage(String fileName);
}
