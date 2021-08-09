package io.poc.service;

import io.poc.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UploaderService implements IUploaderService {

    @Override
    public ResponseEntity<List<Employee>> uploadFile(MultipartFile file) {
        List<Employee> employees = new ArrayList<>();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
