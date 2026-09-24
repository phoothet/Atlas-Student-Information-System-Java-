package com.atlas.sis;
public class ProgramCourse { private String id; private String programId; private String courseId; private int curriculumYear; private int semesterNo;
public ProgramCourse(String id, String programId, String courseId, int curriculumYear, int semesterNo) {
    this.id = id;
    this.programId = programId;
    this.courseId = courseId;
    this.curriculumYear = curriculumYear;
    this.semesterNo = semesterNo;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }

public String getProgramId() { return programId; }
public void setProgramId(String programId) { this.programId = programId; }

public int getCurriculumYear() { return curriculumYear; }
public void setCurriculumYear(int curriculumYear) { this.curriculumYear = curriculumYear; }

@Override
public String toString() {
    return "ProgramCourse{programId='" + programId + "', courseId='" + courseId + "', year=" + curriculumYear + "}";
}
}
