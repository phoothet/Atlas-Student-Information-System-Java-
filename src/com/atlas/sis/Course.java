package com.atlas.sis;
public class Course { private String id; private String code; private String name; private String departmentId; private int credits; private int theoryHours; private int labHours; private CourseType courseType; private String language; private boolean isActive;
public Course(String id, String code, String name, int credits, CourseType courseType, boolean isActive) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.credits = credits;
    this.courseType = courseType;
    this.isActive = isActive;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }

public String getCode() { return code; }
public void setCode(String code) { this.code = code; }

public String getName() { return name; }
public void setName(String name) { this.name = name; }

public int getCredits() { return credits; }
public void setCredits(int credits) { this.credits = credits; }

@Override
public String toString() {
    return "Course{code='" + code + "', name='" + name + "', credits=" + credits + "}";
}
}