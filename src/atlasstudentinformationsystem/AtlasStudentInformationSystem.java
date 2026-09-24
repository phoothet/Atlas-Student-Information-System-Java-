package atlasstudentinformationsystem;
import com.atlas.sis.*; import java.util.ArrayList; import java.util.List;
public class AtlasStudentInformationSystem {
public static void main(String[] args) {
    List<Student> studentsList = new ArrayList<>();

    Faculty faculty = new Faculty("f1", "ENG", "Faculty of Engineering");
    Department department = new Department("d1", "SENG", "Software Engineering", "f1", true);
    Program program = new Program("p1", "SENG-BS", "Software Engineering Undergraduate Program", "d1", DegreeLevel.BACHELOR);

    Student student1 = new Student(
        "s1", 
        "240504505", 
        "12345678901", 
        "Phoo Thet", 
        "Chal", 
        "p1", 
        StudentStatus.ACTIVE
    );
    studentsList.add(student1);

    System.out.println("--- Atlas Student Information System ---");
    System.out.println("Faculty: " + faculty.getName());
    System.out.println("Department: " + department.getName());
    System.out.println("Program: " + program.getName());
    System.out.println("\n--- Registered Students ---");
    for (Student s : studentsList) {
        System.out.println(s);
    }
}
}