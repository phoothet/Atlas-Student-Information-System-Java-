package com.atlas.sis;
public class Student { private String id; private String studentNo; private String nationalId; private String firstName; private String lastName; private String programId; private int enrollmentYear; private int classYear; private StudentStatus status;
public Student(String id, String studentNo, String nationalId, String firstName, String lastName, String programId, StudentStatus status) {
    this.id = id;
    this.studentNo = studentNo;
    this.nationalId = nationalId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.programId = programId;
    this.status = status;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }

public String getStudentNo() { return studentNo; }
public void setStudentNo(String studentNo) { this.studentNo = studentNo; }

public String getFirstName() { return firstName; }
public void setFirstName(String firstName) { this.firstName = firstName; }

public String getLastName() { return lastName; }
public void setLastName(String lastName) { this.lastName = lastName; }

public StudentStatus getStatus() { return status; }
public void setStatus(StudentStatus status) { this.status = status; }

@Override
public String toString() {
    return "Student{no='" + studentNo + "', name='" + firstName + " " + lastName + "', status=" + status + "}";
}
}