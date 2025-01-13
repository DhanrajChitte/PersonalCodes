package com.MongoSpringBoot.MongoSpringBoot.Repository;

import com.MongoSpringBoot.MongoSpringBoot.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

// give the aruguments such as the class name and data type of the primary key in the class
public interface StudentRepo extends MongoRepository<Student,String>
{
    Optional<Student> findByRno(Integer rno);
    Optional<Student> deleteByRno(Integer rno);
}
