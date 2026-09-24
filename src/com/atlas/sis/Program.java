package com.atlas.sis;
public class Program { private String id; private String code; private String name; private String departmentId; private DegreeLevel degreeLevel;
public Program(String id, String code, String name, String departmentId, DegreeLevel degreeLevel) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.departmentId = departmentId;
    this.degreeLevel = degreeLevel;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }

public String getCode() { return code; }
public void setCode(String code) { this.code = code; }

public String getName() { return name; }
public void setName(String name) { this.name = name; }

public DegreeLevel getDegreeLevel() { return degreeLevel; }
public void setDegreeLevel(DegreeLevel degreeLevel) { this.degreeLevel = degreeLevel; }

@Override
public String toString() {
    return "Program{code='" + code + "', name='" + name + "', degreeLevel=" + degreeLevel + "}";
}
}
