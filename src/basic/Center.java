package basic;

import java.io.IOException;
import java.util.ArrayList;
import utils.TeacherListReader;

public class Center {
  CourseDirector courseDirector;
  Administrator administrator;
  ArrayList<Teacher> teacherList;
  Requirement requirement;
  public static String requirementPath;
  public static String databasePath;

  public Center() throws IOException {
    courseDirector = new CourseDirector();
    administrator = new Administrator();
    // load teachers
    teacherList = TeacherListReader.loadTeacherList();
    // path to requirement file
    requirementPath = "src/conf/requirement.txt";
    // path to database file
    databasePath = "src/conf/teachers.txt";
  }

  public CourseDirector getCourseDirector() {
    return courseDirector;
  }

  public void setCourseDirector(CourseDirector courseDirector) {
    this.courseDirector = courseDirector;
  }

  public Administrator getAdministrator() {
    return administrator;
  }

  public void setAdministrator(Administrator administrator) {
    this.administrator = administrator;
  }

  public ArrayList<Teacher> getTeacherList() {
    return teacherList;
  }

  public void setTeacherList(ArrayList<Teacher> teacherList) {
    this.teacherList = teacherList;
  }

  public Requirement getRequirement() {
    return requirement;
  }

  public void setRequirement(Requirement requirement) {
    this.requirement = requirement;
  }
}
