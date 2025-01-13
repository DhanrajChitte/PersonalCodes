package com.MongoSpringBoot.MongoSpringBoot.Model;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Document indicates that table name in the mongodb compass
//  Data Reduce the uses of the getter setter constructor,etc
@Document (collection = "student")


public class Student {

    @Id
    private String id;

    private Integer rno;

    private String name;

    private String address;

    public Student()
    {}

    public Student(Integer rno,String name,String address )
    {
        this.rno = rno;
        this.name=name;
        this.address=address;
    }

     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}



