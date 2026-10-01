package universitycoursesystem;

import models.Student;
import models.Course;
import controllers.CourseController;

public class UniversityCourseSystem {
    public static void main(String[] args) {
        
        CourseController controller = new CourseController();

        
        Course course1 = new Course(101, "Software Design and Architecture", 5);
        controller.addCourse(course1);

        
        Student student1 = new Student(1, "Phoo Thet Chal", "phoo@example.com");

        
        controller.registerCourse(student1, course1);
    }
}