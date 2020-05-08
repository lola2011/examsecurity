package kg.securityexam.controller;

import kg.securityexam.entity.Course;
import kg.securityexam.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping
    public Course create(@RequestBody Course course){
        return courseService.create(course);
    }
}
