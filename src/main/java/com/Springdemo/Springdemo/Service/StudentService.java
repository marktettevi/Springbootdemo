package com.Springdemo.Springdemo.Service;


import com.Springdemo.Springdemo.Entity.Student;
import com.Springdemo.Springdemo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student) {
        return studentRepo.save(student);

    }

    public Student updateDetails(Student student) {
        Student updateStudent = studentRepo.findById(student.getId()).orElse(null);
        if(updateStudent != null) {
            updateStudent.setMark(student.getMark());
            updateStudent.setName(student.getName());
            studentRepo.save(updateStudent);
            return updateStudent;
        }
        return null;
    }


    public Student getDetailsByID(int id) {
        return studentRepo.findById(id).orElse(null);

    }



    public List<Student> getAllDetails() {
        return studentRepo.findAll();

    }



}