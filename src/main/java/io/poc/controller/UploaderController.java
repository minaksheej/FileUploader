package io.poc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import io.poc.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import io.poc.service.UploaderService;

import java.util.List;

@RequestMapping(value = "/api")
@Slf4j
@RequiredArgsConstructor
@RestController
public class UploaderController {

    private final UploaderService uploaderService;
    @PostMapping("/uploader/file")
    public ResponseEntity<List<Employee>> uploadFiles(@RequestParam("file") MultipartFile file) {
        log.info("upload file  - file ={}, ", file);
        return uploaderService.uploadFile(file);
    }

    
}
