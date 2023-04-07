package com.spring.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/* This is singleton as @Component*/
@Service
public class AppService {
    
    private List<Course> courses = new ArrayList<Course>();

    AppService(){
        courses.add(new Course(1, "Java", "Enterprise Edition"));
        courses.add(new Course(2, "C++", "Core"));
        courses.add(new Course(3, "JS", "Vanila"));
        courses.add(new Course(4, "Spring", "Framework"));
        courses.add(new Course(5, "AWS", "Ec2 Instances"));
    }

    public List<Course> getAllCourses(){
        return courses;
    }

    public Course getCourseByID(int id){
        Course course = null;;
        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getID() == id){
                course = courses.get(i);
            }
        }
       return course; 
    }

    public int addCourse(Course course){
        courses.add(course);
        if (courses.indexOf(course) >= 0){
            return 0;
        }else{
            return 1;
        }
    }

    public int updateCourse(Course course){
        deleteCourse(course.getID());
        courses.add(course);

        if (courses.indexOf(course) >= 0){
            return 0;
        }else{
            return 1;
        }
    }

    public int deleteCourse(int id){
        Course temp = getCourseByID(id);
        courses.remove(temp);
        if (courses.indexOf(temp) < 0){
            return 0;
        }else{
            return 1;
        }
    }
}