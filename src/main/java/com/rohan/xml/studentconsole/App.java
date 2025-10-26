package com.rohan.xml.studentconsole;

import com.rohan.xml.studentconsole.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("student_management_console.xml");

        Student student1 = applicationContext.getBean("student", Student.class);
        System.out.println("Student1's Course = " + student1.getCourse());

        Student student2 = applicationContext.getBean("student", Student.class);
        System.out.println("Student2's Course = " + student2.getCourse());

        System.out.println(student1 == student2);  // false
        System.out.println(student1.getCourse() == student2.getCourse());  // true
    }
}
