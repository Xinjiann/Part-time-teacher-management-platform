package event;

import basic.Center;
import basic.Teacher;
import basic.dto.TeacherDTO;
import java.util.ArrayList;
import java.util.Scanner;

public class EditTeacher implements Task {

  @Override
  public void execute(Center center, TeacherDTO teacherDTO) {
    Teacher target = null;
    ArrayList<Teacher> teachers = center.getTeacherList();
    for (Teacher teacher :teachers) {
      if (teacher.getId() == teacherDTO.getTeacherId()) {
        System.out.println("Teacher found: \n" + teacher);
        target = teacher;
        break;
      }
    }
    if (target == null) {
      System.out.println("Teacher not found.");
    } else {
      Scanner scanner = new Scanner(System.in);
      System.out.println("1/6 Please input the teacher's name: ");
      target.setName(scanner.next());
      System.out.println("2/6 Please input the teacher's work experiment (year): ");
      target.setWorkingExperiment(scanner.nextInt());
      System.out.println("3/6 Please input the teacher's teaching ability score (1-5): ");
      target.setTeachingAbilityScore(scanner.nextInt());
      System.out.println("4/6 Please input the teacher's class atmosphere score (1-5): ");
      target.setClassAtmosphereScore(scanner.nextInt());
      System.out.println("5/6 Please input the teacher's communication score (1-5): ");
      target.setCommunicationScore(scanner.nextInt());
      System.out.println("6/6 Please input the teacher's student satisfaction (1-5): ");
      target.setStudentSatisfaction(scanner.nextInt());
      scanner.close();
    }

  }
}
