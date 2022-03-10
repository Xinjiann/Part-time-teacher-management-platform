package basic;

import java.io.IOException;
import java.util.Scanner;
import utils.RequirementReader;
import utils.RequirementWriter;

public class CourseDirector {

  public CourseDirector() {
  }

  public void generateRequirement(Scanner scanner, Center center) throws IOException {

    System.out.println("please choose the action you want:\n1. check requirement\n2. set up new requirement");
    int option = scanner.nextInt();
    switch (option) {
      case 1:
        System.out.println("\nThe exist requirements are:");
        System.out.println(RequirementReader.loadRequirement());
        break;
      case 2:
        this.setRequirement(center, scanner);
        System.out.println("Done!");
        break;
    }

  }

  private void setRequirement(Center center, Scanner scanner) throws IOException {
    System.out.println("please set the requirement");
    System.out.println("1/5 minimum work experiment (year):");
    int workingExperience = scanner.nextInt();
    center.getRequirement().setWorkingExperience(workingExperience);
    System.out.println("2/5 minimum teaching ability score (1-5):");
    int teachingAbilityScore = scanner.nextInt();
    center.getRequirement().setTeachingAbilityScore(teachingAbilityScore);
    System.out.println("3/5 minimum class atmosphere score (1-5):");
    int classAtmosphereScore = scanner.nextInt();
    center.getRequirement().setClassAtmosphereScore(classAtmosphereScore);
    System.out.println("4/5 minimum communication score (1-5):");
    int communicationScore = scanner.nextInt();
    center.getRequirement().setCommunicationScore(communicationScore);
    System.out.println("5/5 minimum student satisfaction (1-5):");
    int studentSatisfaction = scanner.nextInt();
    center.getRequirement().setStudentSatisfaction(studentSatisfaction);
  }



}
