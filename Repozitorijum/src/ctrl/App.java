package ctrl;

import db.Db;
import ui.Ui;

import java.sql.SQLException;

public class App {
    public static void launch() throws SQLException {
        Ctrl ctrl = new Ctrl();
        ctrl.ui = new Ui();
        ctrl.db = new Db();

        mainLoop:
        while (true) {

            int item = ctrl.ui.menu();
            switch (item) {
                case 1:
                    ctrl.showCourses();
                    break;
                case 2:
                    ctrl.addCourse();
                    break;
                case 3:
                    ctrl.updateCourse();
                    break;
                case 4:
                    ctrl.deleteCourse();
                    break;
                case 5:
                    System.out.println("bye");
                    break mainLoop;
            }

        }
    }
}
