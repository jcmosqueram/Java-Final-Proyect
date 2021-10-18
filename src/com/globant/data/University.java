package com.globant.data;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Teacher> teacherList;
    private ArrayList<Student> studentList;
    private ArrayList<Course> courseList;


    public University(String name) {
        this.name = name;
        this.teacherList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.courseList = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void addCourse(Course course){
        this.courseList.add(course);
    }

    public void SearchStudentByID(int id){
       this.studentList.get(id-1);
    }

    public void assignStudentToCourse(int indexCourse, int studentIndex ){
        this.courseList.get(indexCourse).addStudentToCourse(this.studentList.get(studentIndex));
    }

    public ArrayList<Teacher> getTeacherList(){
        return this.teacherList;
    }

    public ArrayList<Student> getStudentList(){
        return this.studentList;
    }

    public ArrayList<Course> getCourseList(){
        return this.courseList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
}




