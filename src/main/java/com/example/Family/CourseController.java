package com.example.Family;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestOperations;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController
{
    @Autowired
    private CourseService courseService;

    @Autowired

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<CourseEntity> findAll()
    {
//        CourseEntity courseEntity1= (CourseEntity) courseService.findAll(courseEntity);
//        return new ResponseEntity<>(courseEntity1, HttpStatus.OK);
        return courseService.findAll();

    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CourseEntity save(@RequestBody CourseEntity courseEntity)
    {
        return courseService.savecourse(courseEntity);
    }

    @PutMapping("/course/{id}")
    public ResponseEntity<CourseEntity> update(@PathVariable Long id, @RequestBody CourseEntity courseEntity)
    {
        CourseEntity oldCourseEntity=courseService.findById(id);
        oldCourseEntity.setCourseName(courseEntity.getCourseName());
        courseService.savecourse(oldCourseEntity);
        return new ResponseEntity<>(oldCourseEntity,HttpStatus.OK);



    }

    @GetMapping("/course/{faculty}")
    public CourseEntity findByFaculty(@PathVariable String faculty)
    {
        return courseService.findCoursebyfaculty(faculty);
    }


}
