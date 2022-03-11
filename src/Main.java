import basic.Administrator;
import basic.Center;
import basic.CourseDirector;
import java.io.IOException;
import java.util.Scanner;
import utils.RequirementWriter;
import utils.TeacherListWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        Center center = new Center();
        CourseDirector courseDirector = center.getCourseDirector();
        Administrator administrator = center.getAdministrator();

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\nPlease choose your character:\n1.Course director  \n2.Administrator  \n3.Quit");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    courseDirector.generateRequirement(scanner, center);
                    break;
                case 2:
                    administrator.manageDatabase(scanner, center);
                    break;
                case 3:
                    flag = false;
            }
            RequirementWriter.writeRequirement(center.getRequirement());
            TeacherListWriter.writeTeacherList(center.getTeacherList());
        }

        scanner.close();


    }
}
