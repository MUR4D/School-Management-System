package com.company;

public class Student {

    private int id;
    private int age;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, int age, String name, int grade, int feesPaid, int feesTotal) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.feesPaid = feesPaid;
        this.feesTotal = feesTotal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void SetAge(int age)
    {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    public int GetAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }

    public int getFeesPaid()
    {
        return feesPaid;
    }

    public int getFeesTotal()
    {
        return feesTotal;
    }

    public int getId() {
        return id;
    }
}
