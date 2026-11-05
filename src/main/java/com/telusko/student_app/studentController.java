package com.telusko.student_app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class studentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudent")
    public List<student> getStudent(){
     return repo.findAll();
    }

    public void addStudent(){
        student s=new student();
        s.setAge(10);
        s.setName("Ankit");
        s.setId(112);
        repo.save(s);
    }
}
