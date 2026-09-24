package com.atlas.sis;
public class CoursePrerequisite { private String id; private String courseId; private String prerequisiteCourseId;
public CoursePrerequisite(String id, String courseId, String prerequisiteCourseId) {
    this.id = id;
    this.courseId = courseId;
    this.prerequisiteCourseId = prerequisiteCourseId;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }

public String getCourseId() { return courseId; }
public void setCourseId(String courseId) { this.courseId = courseId; }

public String getPrerequisiteCourseId() { return prerequisiteCourseId; }
public void setPrerequisiteCourseId(String prerequisiteCourseId) { this.prerequisiteCourseId = prerequisiteCourseId; }

@Override
public String toString() {
    return "CoursePrerequisite{courseId='" + courseId + "', prerequisiteCourseId='" + prerequisiteCourseId + "'}";
}
}