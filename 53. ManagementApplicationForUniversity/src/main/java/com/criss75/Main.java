package com.criss75;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Jurescu Cristian on 16/05/1975
 */
public class Main {
    public static void main(String[] args) {
        Teacher Doe = new Teacher(321, "John", "Doe", "Java");
        Teacher Smith = new Teacher(421, "John", "Smith", "C++");
        Teacher Brown = new Teacher(634, "Angela", "Brown", "JavaScript");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Doe);
        teacherList.add(Smith);
        teacherList.add(Brown);

//        System.out.print(teacherList);

        Student Gore = new Student(654, "Martin", "Gore", 9);
        Student Beckham = new Student(689, "David", "Beckham", 8);
        Student Moore = new Student(442, "Demi", "Moore", 10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Gore);
        studentList.add(Beckham);
        studentList.add(Moore);

        Moore.setGrade(5);

//        System.out.println(studentList);

        Room Paris = new Room("Paris", true);
        Paris.setAvailability(true);

        Course Java = new Course(Paris, teacherList, studentList);
        Teacher Pesci = new Teacher(562, "Joe", "Pesci", "C Sharp");
        Java.addTeacher(Pesci);
        System.out.println(Java.getTeachers());

        Gore.setTaxPaid(240);
        Gore.setTaxPaid(240);
        Gore.totalNumberOfPresences(1);
        Gore.totalNumberOfPresences(1);
        System.out.println("\nTax paid by " + Gore.getLastName() + " : " + Gore.getTaxPaid() + "\nTax to be paid: " + Gore.getRemainingFees() +
                "\nNumber of presences: " + Gore.getTotalNumberOfPresences());

        Student Jim = new Student(543, "Jim", "Jones", 10);
        Java.addStudent(Jim);
        System.out.println(studentList);

    }
}
