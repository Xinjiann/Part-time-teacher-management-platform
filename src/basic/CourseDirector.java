package basic;

import java.io.IOException;
import java.util.Scanner;
import utils.RequirementWriter;

public class CourseDirector {

  public CourseDirector() {
  }

  public void generateRequirement(Center center, Scanner scanner) throws IOException {

    System.out.println("please set the requirement");
    System.out.println("1/5 minimum work experiment (year):");
    int workingExperience = scanner.nextInt();
    System.out.println("2/5 minimum teaching ability score (1-5):");
    int teachingAbilityScore = scanner.nextInt();
    System.out.println("3/5 minimum class atmosphere score (1-5):");
    int classAtmosphereScore = scanner.nextInt();
    System.out.println("4/5 minimum communication score (1-5):");
    int communicationScore = scanner.nextInt();
    System.out.println("5/5 minimum student satisfaction (1-5):");
    int studentSatisfaction = scanner.nextInt();

    Requirement requirement = new Requirement(workingExperience, teachingAbilityScore,
        classAtmosphereScore, communicationScore, studentSatisfaction);

    RequirementWriter.writeRequirement(requirement);
//    Requirement requirement = RequirementReader.loadRequirement();
//    center.setRequirement(requirement);

  }


}
