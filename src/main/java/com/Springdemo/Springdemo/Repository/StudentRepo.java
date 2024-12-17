package com.Springdemo.Springdemo.Repository;

import com.Springdemo.Springdemo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
