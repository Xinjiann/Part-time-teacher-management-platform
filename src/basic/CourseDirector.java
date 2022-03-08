package basic;

import java.io.IOException;
import utils.RequirementReader;

public class CourseDirector {

  public CourseDirector() {
  }

  public void generateRequirement(Center center) throws IOException {


    Requirement requirement = RequirementReader.loadRequirement();
    center.setRequirement(requirement);

  }


}
