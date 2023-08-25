package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// /courses
//course : id, name ,author
@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
                new Course(1, "learn AWS", "sujay"),
                new Course(2, "Devops", "jk")
        );
    }
}
