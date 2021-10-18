package com.globant.data;

import java.util.ArrayList;
import java.util.List;

public class Course {
private String courseName;
private String assignedClassRoom;
private List<Student> studentList;
private Teacher assignedTeacher;


    public Course(String courseName, String assignedClassRoom, Teacher assignedTeacher, Student registeredStudent) {
        this.courseName = courseName;
        this.assignedClassRoom = assignedClassRoom;
        this.assignedTeacher = assignedTeacher;
        this.studentList=new ArrayList<>();
    }

    public void addStudentToCourse (Student student){
        this.studentList.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAssignedClassRoom() {
        return assignedClassRoom;
    }

    public void setAssignedClassRoom(String assignedClassRoom) {
        this.assignedClassRoom = assignedClassRoom;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getAssignedTeacher() {
        return assignedTeacher;
    }

    public void setAssignedTeacher(Teacher assignedTeacher) {
        this.assignedTeacher = assignedTeacher;
    }

    public String toString (){
        return "Course name: "+this.courseName + " || Assigned classroom: " +this.assignedClassRoom + " ||Teacher: " +this.assignedTeacher.getTeacherName();
    }
}
