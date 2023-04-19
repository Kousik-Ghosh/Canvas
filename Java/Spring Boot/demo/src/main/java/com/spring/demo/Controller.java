package com.spring.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/* This is singleton as @Component*/
@RestController
public class Controller {
    
    @Autowired
    private AppService appService;

    @RequestMapping("/Courses")
    public List<Course> getAllCourses(){
        return appService.getAllCourses();
    }

    @RequestMapping("/Courses/{id}")
    public Course getCourseByID(@PathVariable int id){
        return appService.getCourseByID(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Course")
    public String addCourse(@RequestBody Course course){
        if(appService.addCourse(course) == 0){
            return "Course Add Success.";
        }else{
            return "Course Add Failed.";
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Course")
    public String updateCourse(@RequestBody Course course){
        if(appService.updateCourse(course) == 0){
            return "Course Update Success.";
        }else{
            return "Course Update Failed.";
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Course/{id}")
    public String deleteCourse(@PathVariable int id){
        if(appService.deleteCourse(id) == 0){
            return "Course Delete Success.";
        }else{
            return "Course Delete Failed.";
        }
    }


}
