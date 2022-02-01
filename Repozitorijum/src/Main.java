import ctrl.App;
import db.Course;
import db.Db;
import ui.Ui;

import java.sql.*;
import java.util.Scanner;

public class Main extends App {
    public static void main(String[] args) throws SQLException {

       /* Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tests","root","laptop12345");
        //System.out.println(conn.isClosed());

        Statement st = conn.createStatement();

       // st.execute("insert into courses values(null,'Core Java','Java Fundamentals programing')");

        ResultSet rs = st.executeQuery("select * from courses");

        /*boolean hasNext = rs.next();
        System.out.println(hasNext);


        hasNext = rs.next();
        System.out.println(hasNext);

        rs.next();

        //int rowId = rs.getInt("id");
        int rowId=rs.getInt(1);
        System.out.println(rowId);
        String courseTitle = rs.getString("title");
        System.out.println(courseTitle);
         Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

      */


       /* Ui ui = new Ui();
       /* Ui ui = new Ui();
        int selectedOption = ui.menu();
        System.out.println(selectedOption);

        int selectedId = ui.getId();
        System.out.println(selectedId);
 */

      /*  Course course = new Course();
        course.id = 5;
        course.title = "my course";
        course.description = "this is my course about java";
        System.out.println(course);

        ui.updateCourse(course);
        System.out.println(course);
       */

       /* Course course = ui.getCurse();

        Db db = new Db();
        db.deleteCours(1);
        */

        //int id = ui.getId();
        /*

        //db.deleteCours(id);
        Course course = new Course();
        course.id = 1;
        course.title = "my course";
        course.description = "this is my course about java";
        db.updateCours(course);
         */
       /* Db db = new Db();
        Course course = db.getCourse(4);
        System.out.println(course);
        */

        launch();
    }
}




/*
courses
-------------------------------------
id      /   title     /     desc
***********************************
1       /   Core java /     java fundamentals
------------------------------------------
2      / advance java /     advance java features
 */

// create table courses (id int primary key auto_increment, title varchar(512), description varchar(2000));