package service;

import model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class UploaderService implements IUploaderService {

    @Override
    public ResponseEntity<List<Employee>> uploadFile(MultipartFile file) {
        return null;
    }
}
