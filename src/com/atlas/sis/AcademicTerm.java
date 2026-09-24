package com.atlas.sis;
public class AcademicTerm { private String id; private String code; private String name; private int year; private Semester semester; private boolean isCurrent;
public AcademicTerm(String id, String code, String name, int year, Semester semester, boolean isCurrent) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.year = year;
    this.semester = semester;
    this.isCurrent = isCurrent;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }

public String getCode() { return code; }
public void setCode(String code) { this.code = code; }

public String getName() { return name; }
public void setName(String name) { this.name = name; }

@Override
public String toString() {
    return "AcademicTerm{code='" + code + "', name='" + name + "'}";
}
}
