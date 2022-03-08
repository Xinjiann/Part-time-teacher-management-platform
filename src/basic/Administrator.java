package basic;

import basic.dto.AddTeacherDTO;
import basic.dto.DeleteTeacherDTO;
import basic.dto.EditTeacherDTO;
import basic.dto.FindTeacherDTO;
import basic.dto.TeacherDTO;
import event.AddTeacher;
import event.FindTeacher;
import event.Task;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrator {

  public Administrator() {
  }

  public void handleRequest(TeacherDTO teacherDTO) {
    System.out.println(teacherDTO.getTeacherId());

  }

  public void filterList(Center center) {
    ArrayList<Teacher> teachers = new ArrayList<>();
    Requirement requirement = center.getRequirement();
    for (Teacher teacher : center.teacherList) {
      if (teacher.getCommunicationScore() < requirement.getCommunicationScore()
          || teacher.getClassAtmosphereScore() < requirement.getClassAtmosphereScore()
          || teacher.getTeachingAbilityScore() < requirement.getTeachingAbilityScore()
          || teacher.getStudentSatisfaction() < requirement.getStudentSatisfaction()
          || teacher.getWorkingExperiment() < requirement.getWorkingExperiment()) {
        teachers.add(teacher);
      }
    }
    System.out.println("Teachers need to be trained are:");
    for (Teacher teacher : teachers) {
      System.out.println(teacher);
    }
  }

  public void manageDatabase(Scanner scanner, Center center) {
    TeacherDTO teacherDTO = new TeacherDTO();;
    Task task = null;

    System.out.println("Please choose the action below: \n" + "1. add a teacher  2. delete a teacher  3. edit a teacher  4. find a teacher");
    int input = scanner.nextInt();
    switch (input) {
      case 1:
        task = new AddTeacher();
        this.addTeacher(scanner, teacherDTO);
        break;
      case 2:
        this.deleteTeacher(scanner, teacherDTO);
      case 3:
        this.editTeacher(scanner, teacherDTO);
        break;
      case 4:
        task = new FindTeacher();
        this.findTeacher(scanner, teacherDTO);
        break;
    }
    assert task != null;
    task.execute(center, teacherDTO);
  }


  private void deleteTeacher(Scanner scanner, TeacherDTO teacherDTO) {

  }

  private void editTeacher(Scanner scanner, TeacherDTO teacherDTO) {
  }

  private void findTeacher(Scanner scanner, TeacherDTO teacherDTO) {
    System.out.println("Please input the teacher's id: ");
    teacherDTO.setTeacherId(scanner.nextInt());
  }

  private void addTeacher(Scanner scanner, TeacherDTO teacherDTO) {
    System.out.println("1/6 Please input the teacher's name: ");
    teacherDTO.setName(scanner.next());
    System.out.println("2/6 Please input the teacher's work experiment (year): ");
    teacherDTO.setWorkingExperiment(scanner.nextInt());
    System.out.println("3/6 Please input the teacher's teaching ability score (1-5): ");
    teacherDTO.setTeachingAbilityScore(scanner.nextInt());
    System.out.println("4/6 Please input the teacher's class atmosphere score (1-5): ");
    teacherDTO.setClassAtmosphereScore(scanner.nextInt());
    System.out.println("5/6 Please input the teacher's communication score (1-5): ");
    teacherDTO.setCommunicationScore(scanner.nextInt());
    System.out.println("6/6 Please input the teacher's student satisfaction (1-5): ");
    teacherDTO.setStudentSatisfaction(scanner.nextInt());
  }
}
