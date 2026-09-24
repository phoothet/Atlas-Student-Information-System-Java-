package com.atlas.sis;
public class Instructor { private String id; private String nationalId; private String firstName; private String lastName; private InstructorTitle title; private String departmentId; private String email; private String phone;
public Instructor(String id, String firstName, String lastName, InstructorTitle title, String departmentId) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.title = title;
    this.departmentId = departmentId;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }

public String getFirstName() { return firstName; }
public void setFirstName(String firstName) { this.firstName = firstName; }

public String getLastName() { return lastName; }
public void setLastName(String lastName) { this.lastName = lastName; }

public InstructorTitle getTitle() { return title; }
public void setTitle(InstructorTitle title) { this.title = title; }

@Override
public String toString() {
    return "Instructor{name='" + firstName + " " + lastName + "', title=" + title + "}";
}
}
