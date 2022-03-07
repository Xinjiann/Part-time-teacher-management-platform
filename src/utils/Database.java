package utils;

import basic.Teacher;
import java.util.ArrayList;

// read data from txt and store them in memory
public class Database {

  private ArrayList<Teacher> teacherList;

  public Database() {
    this.teacherList = new ArrayList<>();
  }

  public void loadData(String path) {
    // 1.read txt file

    // 2.transfer data into teacher object

    // 3.add teacher into list
  }

  public ArrayList<Teacher> getTeacherList() {
    return teacherList;
  }

  public void setTeacherList(ArrayList<Teacher> teacherList) {
    this.teacherList = teacherList;
  }
}
