package event;

import basic.Center;
import basic.dto.TeacherDTO;

public interface Task {

  public void execute(Center center, TeacherDTO teacherDTO);

}
