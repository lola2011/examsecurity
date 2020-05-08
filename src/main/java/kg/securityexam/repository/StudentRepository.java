package kg.securityexam.repository;

import kg.securityexam.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findStudentsByFullName (String fullname);
}
