package ctrl;

import db.Course;
import db.Db;
import ui.Ui;

import java.sql.SQLException;
import java.util.List;

public class Ctrl {

    public Ui ui;
    public Db db;

    public void showCourses() throws SQLException {
        List allCourses = db.getAllCourses();

        for(Object o: allCourses){
            Course c = (Course)o;
            System.out.println(c);
        }
    }

    public void addCourse() throws SQLException {
        Course course = ui.getCurse();
        db.insertCours(course);

    }

    public void deleteCourse() throws SQLException {
        int id = ui.getId();
        db.deleteCours(id);
    }

    public void updateCourse() throws SQLException {
        int id = ui.getId();
        Course course = db.getCourse(id);
        if(course == null){
            System.out.println("Kurs ne postoji");
            return;
        }

        ui.updateCourse(course);
        db.updateCours(course);
    }
}
