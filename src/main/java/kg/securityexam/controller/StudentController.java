package kg.securityexam.controller;

import kg.securityexam.entity.Student;
import kg.securityexam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentService.create(student);
    }

    @DeleteMapping
    public Student deleteById(@RequestParam(name = "id") Long id) {
        return studentService.deleteById(id);
    }

@GetMapping("/{id}")
public Student getById(@PathVariable Long id){
        return studentService.getById(id);

}
    @GetMapping("/fullname")
    public Student searchByFullname(@RequestHeader String fullname) {
        return studentService.searchByFullname(fullname);
    }



}
