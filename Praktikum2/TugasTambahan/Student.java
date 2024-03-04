package TugasTambahan;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int age;
    String address;
    String studentID;
    List<Course> coursesEnrolled;

    Student(String name, int age, String address, String studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    String getName(){
        return this.name;
    }

    void getDetails() {
        System.out.println("========== Student Details ==========");
        System.out.println(String.format("Name: %s", this.name));
        System.out.println(String.format("Age: %d", this.age));
        System.out.println(String.format("Address: %s", this.address));
        System.out.println(String.format("Student ID: %s", this.studentID));
    }

    void enrollInCourse(Course course) {
        if (!this.coursesEnrolled.contains(course)){
            this.coursesEnrolled.add(course);
            course.studentsEnrolled.add(this);
        }
    }

    void viewEnrolledCourses() {
        System.out.println("=========== " + this.name + "\'s Courses List ==========");
        for (Course course: coursesEnrolled){
            System.out.println(course.getCourseName());
        }
    }
}