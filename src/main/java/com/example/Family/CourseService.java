package com.example.Family;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService
{
    @Autowired
    private CourseRepository courseRepository;

    //findall
    public List<CourseEntity> findAll( )
    {
        return (List<CourseEntity>) courseRepository.findAll();
    }
    //findbyid
    public CourseEntity findById(Long Id)
    {
        Optional<CourseEntity> courseEntity= courseRepository.findById(Id);
        if(courseEntity.isPresent())
        {
            return courseEntity.get();
        }
        else
        {
            return  null;
        }

    }
    //save
    public CourseEntity savecourse(CourseEntity courseEntity)
    {
        return courseRepository.save(courseEntity);
    }
    //update
//    public CourseEntity updateCourse(CourseEntity courseEntity)
//    {
//        return courseRepository.
//    }
    //delete
    public void delete(CourseEntity courseEntity)
    {
        courseRepository.delete(courseEntity);
    }

    public CourseEntity findCoursebyfaculty(String faculty)
    {
        return courseRepository.findAllByFaculty(faculty);
    }


}
