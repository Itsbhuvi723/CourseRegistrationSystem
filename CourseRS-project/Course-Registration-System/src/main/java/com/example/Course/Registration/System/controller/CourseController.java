package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseservice;

    @GetMapping("/courses")
    public List<Course> avilablecourse(){
        return courseservice.availablecourse();
    }

    @GetMapping("/courses/enroll")
    public List<CourseRegistry> enrolledstudents(){
        return courseservice.enrolledstudents();
    }

    @PostMapping("/courses/register")
    public String enrollcourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){
        courseservice.enrollcourse(name,emailId,courseName);
        return "congratulation! "+name+" for registering "+ courseName;
    }

    @DeleteMapping("/courses/registry")
    public String deleteall(){
        courseservice.deleteall();
        return "delete all details in courseregistry";
    }

}
