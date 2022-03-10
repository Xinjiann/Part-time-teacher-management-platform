package event;

import basic.Center;
import basic.Requirement;
import basic.Teacher;
import basic.dto.TeacherDTO;
import java.io.IOException;
import java.util.ArrayList;
import utils.RequirementReader;

public class FilterTeacher implements Task{

  @Override
  public void execute(Center center, TeacherDTO teacherDTO) throws IOException {

    // filter list
    ArrayList<Teacher> teachers = new ArrayList<>();
    Requirement requirement = center.getRequirement();
    for (Teacher teacher : center.getTeacherList()) {
      if (teacher.getCommunicationScore() < requirement.getCommunicationScore()
          || teacher.getClassAtmosphereScore() < requirement.getClassAtmosphereScore()
          || teacher.getTeachingAbilityScore() < requirement.getTeachingAbilityScore()
          || teacher.getStudentSatisfaction() < requirement.getStudentSatisfaction()
          || teacher.getWorkingExperiment() < requirement.getWorkingExperience()) {
        teachers.add(teacher);
      }
    }
    System.out.println("Teachers need to be trained are:\n\n"+Center.title);
    for (Teacher teacher : teachers) {
      System.out.println(teacher);
    }
  }

}
