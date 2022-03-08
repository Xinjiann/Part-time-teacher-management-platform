package event;

import basic.Center;
import basic.Teacher;
import basic.dto.TeacherDTO;
import java.util.ArrayList;

public class AddTeacher implements Task {

  @Override
  public void execute(Center center, TeacherDTO teacherDTO) {
    Teacher teacher = new Teacher(teacherDTO);
    ArrayList<Teacher> teachers = center.getTeacherList();
    teacher.setId(teachers.size()+1);
    teachers.add(teacher);
    center.setTeacherList(teachers);
  }
}
