package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student student1 = new Student(1,23,"Murad",3,2000,3000);
        Student student2 = new Student(2,40,"Umar",5,1000,1500);
        Student student3 = new Student(3,40,"Usman",5,1000,1500);
        Student student4 = new Student(4,40,"Ali",5,1000,1500);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Teacher teacher1 = new Teacher(1,"Muhammad", 1000000, 10000);
        Teacher teacher2 = new Teacher(1,"AbuBakr", 100000, 4000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);


        School gymnasium = new School(studentList,teacherList);

        gymnasium.AddStudent(student1);
        gymnasium.AddStudent(student2);
        gymnasium.AddTeacher(teacher1);
        gymnasium.AddTeacher(teacher2);

        gymnasium.setTotalMoneyEarned(500);



    }
}
