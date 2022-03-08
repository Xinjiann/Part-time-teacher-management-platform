package basic;

import java.io.IOException;
import java.util.ArrayList;
import utils.RequirementReader;
import utils.TeacherListReader;

public class Center {
  CourseDirector courseDirector;
  Administrator administrator;
  ArrayList<Teacher> teacherList;
  Requirement requirement;

  public Center() throws IOException {
    courseDirector = new CourseDirector();
    administrator = new Administrator();
    // load teachers
    teacherList = TeacherListReader.loadTeacherList();
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
