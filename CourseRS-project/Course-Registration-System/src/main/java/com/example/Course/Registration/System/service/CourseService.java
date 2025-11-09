package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courserepo ;

    @Autowired
    CourseRegistryRepo courseregistryrepo ;

    public List<CourseRegistry> enrolledstudents() {
        return courseregistryrepo.findAll();
    }

    public List<Course> availablecourse() {
        return courserepo.findAll();
    }

    public void enrollcourse(String name,String emailId,String courseName) {
        CourseRegistry course= new CourseRegistry(name,emailId,courseName);
        courseregistryrepo.save(course);
    }

    public void deleteall() {
        courseregistryrepo.deleteAll();
    }
}
