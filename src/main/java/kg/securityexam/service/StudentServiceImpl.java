package kg.securityexam.service;

import kg.securityexam.entity.Student;
import kg.securityexam.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student deleteById(Long id) {

        Student student=getById(id);
        if(student!=null){
            studentRepository.deleteById(id);
        }
        return student;
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student searchByFullname(String fullname) {
        return studentRepository.findStudentsByFullName(fullname);

    }

}
