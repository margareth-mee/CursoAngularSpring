package com.superdev.crudspring.controller;

import java.util.List;

import com.superdev.crudspring.model.Course;
import com.superdev.crudspring.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@AllArgsConstructor
@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository courseRepository;
    
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    //@RequestMapping(method = RequestMethod.GET) another way
    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }


}
