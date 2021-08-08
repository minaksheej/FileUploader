package service;

import model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IUploaderService {
    ResponseEntity<List<Employee>> uploadFile(MultipartFile file);
}
