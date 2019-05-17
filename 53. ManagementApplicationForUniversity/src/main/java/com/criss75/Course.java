package com.criss75;

import java.util.List;

/**
 * Define a course through room, teacher, students, weekday and hour
 * create list of teachers and students
 */
public class Course {
    private Room room;
    private List<Teacher> teachers;
    private List<Student> students;
    private String weekDay;
    private int hour;

    /**
     * creates a new course object
     * defines weekdays to "Tuesday and Thursday"
     * defines hour of course to 18 o'clock
     *
     * @param room     room of the course
     * @param teachers list of teachers of the courses
     * @param students list of students in the courses
     */
    public Course(Room room, List<Teacher> teachers, List<Student> students) {
        this.room = room;
        this.teachers = teachers;
        this.students = students;
        this.weekDay = "Tuesday and Thursday";
        this.hour = 18;
    }

    /**
     * @return returns the list of teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * @return returns the list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Add a teacher to the course
     *
     * @param teacher the teachers to be added to the course
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Add a student to the course
     *
     * @param student the students to be added to the course
     */
    public void addStudent(Student student) {
        students.add(student);
    }
}
