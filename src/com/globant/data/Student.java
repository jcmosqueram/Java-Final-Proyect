package com.globant.data;

public class Student {
    private String name;
    private int age;
    private int id;
    private static int assignId=1;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = this.assignId++;
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public int getStudentAge() {
        return age;
    }

    public void setStudentAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return id;
    }

    public void setStudentId(int id) {
        this.id = id;
    }
}
