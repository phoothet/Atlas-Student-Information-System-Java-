package controllers;

import models.Student;
import models.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseController {
    private List<Course> availableCourses = new ArrayList<>();
    private List<String> registrations = new ArrayList<>();

    // Course အသစ်ထည့်ရန်
    public void addCourse(Course course) {
        availableCourses.add(course);
    }

    // ကျောင်းသားက Course ယူမည့် လုပ်ငန်းစဉ်
    public boolean registerCourse(Student student, Course course) {
        if (availableCourses.contains(course)) {
            registrations.add(student.getName() + " enrolled in " + course.getCourseName());
            System.out.println("Registration Successful for " + student.getName() + " in " + course.getCourseName());
            return true;
        }
        System.out.println("Course not available.");
        return false;
    }
}