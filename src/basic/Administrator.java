package basic;

import basic.dto.TeacherDTO;
import event.AddTeacher;
import event.DeleteTeacher;
import event.EditTeacher;
import event.FindTeacher;
import event.Task;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrator {

  public Administrator() {
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
        task = new DeleteTeacher();
        this.deleteTeacher(scanner, teacherDTO);
        break;
      case 3:
        task = new EditTeacher();
        this.editTeacher(scanner, teacherDTO);
        break;
      case 4:
        task = new FindTeacher();
        this.findTeacher(scanner, teacherDTO);
        break;
    }
    if (task == null) {
      System.out.println("input number invalid!");
    } else {
      task.execute(center, teacherDTO);
    }
  }


  private void deleteTeacher(Scanner scanner, TeacherDTO teacherDTO) {
    System.out.println("Please input the id of the teacher you want to delete: ");
    teacherDTO.setTeacherId(scanner.nextInt());
  }

  private void editTeacher(Scanner scanner, TeacherDTO teacherDTO) {
    System.out.println("Please input the id of the teacher you want to edit: ");
    teacherDTO.setTeacherId(scanner.nextInt());
  }

  private void findTeacher(Scanner scanner, TeacherDTO teacherDTO) {
    System.out.println("Please input the id of the teacher you want to find: ");
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
