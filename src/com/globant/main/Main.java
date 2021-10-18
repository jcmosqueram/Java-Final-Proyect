package com.globant.main;

import com.globant.data.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University("Java University");

        university.getTeacherList().add(new FullTimeTeacher("Pedro Perez",800F,15));
        university.getTeacherList().add(new FullTimeTeacher("Carlos Molina",3300F,18));
        university.getTeacherList().add(new PartTimeTeacher("Diana Restrepo",200F,25));
        university.getTeacherList().add(new PartTimeTeacher("Natalia Montoya",2100F,20));

        university.getStudentList().add(new Student("Adriana Perez",20));
        university.getStudentList().add(new Student("Juan Gonzalez",28));
        university.getStudentList().add(new Student("Andres Martinez",30));
        university.getStudentList().add(new Student("Tatiana Aguirre",24));
        university.getStudentList().add(new Student("Mario Gutierrez",19));
        university.getStudentList().add(new Student("Monica Murillo",22));

        university.getCourseList().add(new Course("Computer Science","Room 1",university.getTeacherList().get(0),university.getStudentList().get(1)));
        university.getCourseList().add(new Course("programming Logic","Room 2",university.getTeacherList().get(1),university.getStudentList().get(3)));
        university.getCourseList().add(new Course("Numeric Methods","Room 3",university.getTeacherList().get(2),university.getStudentList().get(4)));
        university.getCourseList().add(new Course("Java Basics","Room 4",university.getTeacherList().get(3),university.getStudentList().get(5)));


        university.assignStudentToCourse(2,2);
        university.assignStudentToCourse(1,1);
        university.assignStudentToCourse(0,3);
        university.assignStudentToCourse(3,4);
        university.assignStudentToCourse(0,2);
        university.assignStudentToCourse(3,1);

        boolean isMenuActive=true;
        while (isMenuActive){
        System.out.println("University Tracking System --please select an option:-- " +

                "\n1.List of teachers" +
                "\n2.List of courses" +
                "\n3.Create a new student" +
                "\n4.Create a new class" +
                "\n5.Search student by ID" +
                "\n6.Exit");
        Scanner menu = new Scanner (System.in);
        int selection= menu.nextInt();
        switch (selection) {
            case 1:
                for (Teacher element : university.getTeacherList()) {
                    System.out.println(element.toString());
                    }
                    break;
                    case 2:
                        System.out.println("Select an option:");
                        for (int i = 0; i <university.getCourseList().size() ; i++) {
                            System.out.println((i+1) + "." + university.getCourseList().get(i).getCourseName());
                        }
                        Scanner coursesMenu= new Scanner(System.in);
                        int indexCourse= coursesMenu.nextInt()-1;
                        if (indexCourse>0 && indexCourse<=university.getCourseList().size()) {
                            System.out.println(university.getCourseList().get(indexCourse).toString());
                            System.out.println("The students enrolled in the course are:");
                            for (int i = 0; i <university.getCourseList().get(indexCourse).getStudentList().size() ; i++) {
                                System.out.println((i+1) + "." + university.getCourseList().get(indexCourse).getStudentList().get(i).getStudentName());
                            }
                        }
                        else {
                            System.out.println("Invalid option");
                        }
                        break;
                    case 3:
                        System.out.println("add the name of student:");
                        Scanner nameStud = new Scanner (System.in);
                        String name= nameStud.nextLine();

                        System.out.println("add the age of the student:");
                        Scanner ageStud = new Scanner (System.in);
                        int age= ageStud.nextInt();

                        university.getStudentList().add(new Student(name,age));

                        System.out.println("Select the course which you want to add the student:");
                        for (int i = 0; i <university.getCourseList().size() ; i++) {
                            System.out.println((i+1) + "." + university.getCourseList().get(i).getCourseName());
                        }
                        int indexToSelectCourse = nameStud.nextInt();
                        if(indexToSelectCourse>0 && indexToSelectCourse<=university.getCourseList().size()) {
                            university.assignStudentToCourse(
                                    indexToSelectCourse-1,
                                    university.getStudentList().size() - 1
                            );
                            System.out.println(university.getStudentList().get(university.getStudentList().size() - 1).getStudentName() +
                                    " was added to the course: "+university.getCourseList().get(indexToSelectCourse).getCourseName()
                                    );
                        }
                        else {
                            System.out.println("Invalid Option");
                        }
                        break;
                    case 4:
                        System.out.println("Type the name of the new course:");
                        Scanner newCourse = new Scanner (System.in);
                        String nameOfTheCourse= newCourse.nextLine();

                        System.out.println("Type the name of the classroom:");
                        String nameOfTheClassRoom= newCourse.nextLine();

                        System.out.println("Select teacher:");
                        for (int i = 0; i <university.getTeacherList().size() ; i++) {
                            System.out.println(i+1 +"." +university.getTeacherList().get(i).getTeacherName());
                        }
                        int selectedTeacher= newCourse.nextInt();

                        System.out.println("Select student:");
                        for (int i = 0; i <university.getStudentList().size() ; i++) {
                            System.out.println(i+1 +"." +university.getStudentList().get(i).getStudentName());
                        }
                        int selectedStudent= newCourse.nextInt();

                        if (selectedTeacher>0 && selectedStudent>0 &&selectedTeacher<=university.getTeacherList().size() && selectedStudent<=university.getStudentList().size()) {
                            university.getCourseList().add(new Course(nameOfTheCourse, nameOfTheClassRoom, university.getTeacherList().get(selectedTeacher - 1), university.getStudentList().get(selectedStudent - 1)));
                        }
                        else {
                            System.out.println("Invalid option");
                        }
                        System.out.println(university.getCourseList().get(university.getCourseList().size() - 1).getCourseName() +
                                " was added successfully."
                        );

                        break;
                    case 5:
                        System.out.println("Select student Id:");
                        for (int i = 0; i <university.getStudentList().size() ; i++) {
                            System.out.println(i+1 +"." +university.getStudentList().get(i).getStudentName());
                        }
                        Scanner searchId = new Scanner (System.in);
                        int id= searchId.nextInt();
                        if (id>0 && id<=university.getStudentList().size() ) {
                            for (int i = 0; i < university.getCourseList().size(); i++) {
                                for (int j = 0; j < university.getCourseList().get(i).getStudentList().size(); j++) {
                                    if (university.getStudentList().get(id - 1).getStudentId() == university.getCourseList().get(i).getStudentList().get(j).getStudentId()) {
                                        System.out.println(university.getCourseList().get(i).toString());
                                    }
                                }
                            }
                        }
                        break;
                    case 6:
                        isMenuActive=false;
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
        }
    }


}
