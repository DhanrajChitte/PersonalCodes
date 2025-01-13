package com.MongoSpringBoot.MongoSpringBoot.Controller;


import com.MongoSpringBoot.MongoSpringBoot.Model.Student;
import com.MongoSpringBoot.MongoSpringBoot.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
   @Autowired
    StudentRepo studentRepo;


    @PostMapping("/addStudent")
    // create the function to add the data in the mongodb compass
    // @RequestBody because give the data from the postman using the request and create the object of the studnet class
    public void addStudent(@RequestBody Student student)
    {
       //for saving the data repository used
       studentRepo.save(student);
    }

    @GetMapping("/fetchStudents")
    public List<Student> fetchStudents(){
   return studentRepo.findAll();}

  @GetMapping("/getStudent/{rno}")
   public Student getStudent(@PathVariable Integer rno){
    return studentRepo.findByRno(rno).orElse(null);

}

   // update the existing database
   @PutMapping("/updateStudent")
   public void updateStudent(@RequestBody Student student) {
       // fetch the object using rno
       Student data = studentRepo.findByRno(student.getRno()).orElse(null);
       System.out.println(data);

       //check if null
       if (data != null) {
           data.setName(student.getName());
           data.setAddress(student.getAddress());
           studentRepo.save(data);
       }

   }

    @DeleteMapping("/deleteStudent/{rno}")
    // create the function to add the data in the mongodb compass
    // @RequestBody because give the data from the postman using the request and create the object of the studnet class
    public void deleteStudent(@PathVariable Integer rno)
    {
        //for saving the data repository used
        studentRepo.deleteByRno(rno);
    }



}