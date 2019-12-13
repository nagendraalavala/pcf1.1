package com.example.Family;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<CourseEntity,Long>
{
     CourseEntity findAllByFaculty(String faculty);


}
