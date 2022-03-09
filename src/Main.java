import basic.Administrator;
import basic.Center;
import basic.CourseDirector;
import java.io.IOException;
import java.util.Scanner;
import utils.TeacherListWriter;

public class Main {

    public static void main(String[] args) throws IOException {



        Center center = new Center();
        CourseDirector courseDirector = center.getCourseDirector();
        Administrator administrator = center.getAdministrator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("please choose your character:\n1.course director  2.administrator  3.quit");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                courseDirector.generateRequirement(center, scanner);
                break;
            case 2:
                administrator.manageDatabase(scanner, center);
                break;
        }
        scanner.close();

        TeacherListWriter.writeTeacherList(center.getTeacherList());
    }
}
