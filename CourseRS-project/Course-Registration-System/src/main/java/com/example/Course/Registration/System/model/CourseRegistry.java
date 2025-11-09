package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CourseRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    private String name;
    private String emailId;
    private String courseName;

    public CourseRegistry(String name, String emailId,String courseName) {
        this.name = name;
        this.courseName = courseName;
        this.emailId = emailId;
    }

    public CourseRegistry() {
    }
}
