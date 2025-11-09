package com.example.Course.Registration.System.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {
    @Id
    public String courseId;
    public String courseName;
    public String trainer;
    public int durationInWeeks;

}
