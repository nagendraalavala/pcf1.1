package com.example.Family;



import javax.persistence.*;

@Entity
@Table(name = "Courses")
public class CourseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String courseName;
    private String faculty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                                ", faculty='" + faculty + '\'' +
                '}';
    }
}
