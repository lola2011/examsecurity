package kg.securityexam.service;

import kg.securityexam.entity.Course;
import kg.securityexam.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public Course create(Course course) {
        return courseRepository.save(course);
    }
}
