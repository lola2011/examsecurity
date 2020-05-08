package kg.securityexam.boot;

import kg.securityexam.service.CourseService;
import kg.securityexam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Init implements CommandLineRunner {
    @Autowired
   private StudentService studentService;
    @Autowired
    private CourseService courseService;
    @Override
    public void run(String... args) throws Exception {

    }
}
