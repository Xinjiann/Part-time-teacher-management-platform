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
  public static String requirementPath;
  public static String databasePath;
  public static String title;

  public Center() throws IOException {
    courseDirector = new CourseDirector();
    administrator = new Administrator();
    // path to requirement file
    requirementPath = "src/conf/requirement.txt";
    // path to database file
    databasePath = "src/conf/teachers.txt";
    // load requirement
    requirement = RequirementReader.loadRequirement();
    // load teachers
    teacherList = TeacherListReader.loadTeacherList();
    title = "id    name            workExperiment    teachingAbility   classAtmosphere    communication   studentSatisfaction";
  }

  public CourseDirector getCourseDirector() {
    return courseDirector;
  }


  public Administrator getAdministrator() {
    return administrator;
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
