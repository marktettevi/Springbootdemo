package com.Springdemo.Springdemo.Controller;

import com.Springdemo.Springdemo.Entity.Student;
import com.Springdemo.Springdemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student){
        return studentService.saveDetails(student);

    }

    @PutMapping("/updateStudent")
    public Student updateDetails(@RequestBody Student student){
        return studentService.updateDetails(student);

    }

    @GetMapping("/getStudent/{id}")
    public Student getDetailsByID(@PathVariable int id){
        return studentService.getDetailsByID(id);

    }

    @GetMapping("/getStudent")
    public List<Student> getDetails(){
        return studentService.getAllDetails();

    }

}
