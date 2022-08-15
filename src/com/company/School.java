package com.company;

import java.util.List;

public class School {

    private List<Student> Students;
    private List<Teacher> Teachers;
    private int totalMoneyEarned;
    private int totalMoneySpent;


    public School(List<Student> students, List<Teacher> teachers) {
        Students = students;
        Teachers = teachers;
       // this.totalMoneyEarned = 0;
       // this.totalMoneySpent = 0;
    }

    public void setStudents(List<Student> students) {
        Students = students;
    }

    public void setTeachers(List<Teacher> teachers) {
        Teachers = teachers;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public List<Teacher> getTeachers() {

        return Teachers;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


    public void AddStudent(Student student)
    {
        Students.add(student);
    }

    public void AddTeacher(Teacher teacher)
    {
        Teachers.add(teacher);
    }

    public void UpdateTotalMoneyEarned(int moneyEarned)
    {
        totalMoneyEarned += moneyEarned;
    }

    public void UpdateTotalMoneySpent(int moneySpent)
    {
        if(totalMoneySpent > 0) totalMoneySpent -= moneySpent;
    }

}
