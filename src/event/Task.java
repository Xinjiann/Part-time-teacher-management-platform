package event;

import basic.Center;
import basic.dto.TeacherDTO;
import java.io.IOException;

public interface Task {

  public void execute(Center center, TeacherDTO teacherDTO) throws IOException;

}
