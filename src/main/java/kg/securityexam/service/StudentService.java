package kg.securityexam.service;

import kg.securityexam.entity.Student;

public interface StudentService {
Student create(Student student);
Student deleteById(Long id);
Student getById(Long id);
Student searchByFullname(String fullname);
}
