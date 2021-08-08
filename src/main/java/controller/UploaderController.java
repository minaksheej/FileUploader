package controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import service.UploaderService;

import java.util.List;

@RestController
@RequestMapping("/upload")
@Slf4j
@RequiredArgsConstructor
public class UploaderController {

    private final UploaderService uploaderService;
    @PostMapping()
    public ResponseEntity<List<Employee>> uploadFiles(@RequestParam("file") MultipartFile file) {
        log.info("upload circuits  - file ={}, ", file);
        return uploaderService.uploadFile(file);
    }
}
