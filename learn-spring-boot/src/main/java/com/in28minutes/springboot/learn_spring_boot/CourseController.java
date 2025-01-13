package com.in28minutes.springboot.learn_spring_boot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;
@RestController
public class CourseController {
     @RequestMapping("/courses")
    public List<Course> retrieveAllCourses()
 { return Arrays.asList(
        new Course(1,"Learn java","in28minutes"), new Course(2,"Learn AWS","In 1 Hour")
 );
}

}


