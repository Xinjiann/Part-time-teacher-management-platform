import utils.Database;

public class Main {

    public static void main(String[] args) {
        // load data from txt file
        String path = "teacher.txt";
        Database database = new Database();
        database.loadData(path);

        database.getTeacherList();

    }
}
