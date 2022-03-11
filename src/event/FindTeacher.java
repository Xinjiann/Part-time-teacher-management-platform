package event;

import basic.Center;
import basic.Teacher;
import basic.dto.TeacherDTO;
import java.util.ArrayList;

public class FindTeacher implements Task {

  @Override
  public void execute(Center center, TeacherDTO teacherDTO) {
    ArrayList<Teacher> teachers = center.getTeacherList();
    // first find teacher by id
    for (Teacher teacher :teachers) {
      if (teacher.getId() == teacherDTO.getTeacherId()) {
        System.out.println(Center.title);
        System.out.println(teacher);
        return;
      }
    }
    System.out.println("Teacher not found.");
  }
}
