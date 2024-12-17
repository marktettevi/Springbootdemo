package com.Springdemo.Springdemo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "Student_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;

    @Column(name = "Student_Mark")
    private int mark;

    @Column(name = "Name")
    private String name;


}
