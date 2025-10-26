package com.rohan.java.studentconsole.config;

import com.rohan.java.studentconsole.beans.Course;
import com.rohan.java.studentconsole.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentManagementConsoleConfig {

    @Bean
    @Scope("prototype")
    public Student student(@Autowired Course course){
        Student student = new Student();
        student.setId(1);
        student.setName("Rohan");
        student.setCourse(course);
        return student;
    }

    @Bean
    public Course course(){
        return new Course("Data Science using Python");
    }
}
