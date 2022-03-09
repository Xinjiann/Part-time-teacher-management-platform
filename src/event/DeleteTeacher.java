package event;

import basic.Center;
import basic.Teacher;
import basic.dto.TeacherDTO;
import java.util.ArrayList;

public class DeleteTeacher implements Task {

  @Override
  public void execute(Center center, TeacherDTO teacherDTO) {
    ArrayList<Teacher> teachers = center.getTeacherList();
    for (Teacher teacher : teachers) {
      if (teacher.getId() == teacherDTO.getTeacherId()) {
        teachers.remove(teacher);
        this.resetId(teachers, center);
        System.out.println("Success removed teacher " + teacher.getName());
        return;
      }
    }
    System.out.println("Teacher not found");
  }

  private void resetId(ArrayList<Teacher> teachers, Center center) {
    for (Teacher teacher : teachers) {
      teacher.setId(teachers.indexOf(teacher)+1);
    }
    center.setTeacherList(teachers);
  }
}
