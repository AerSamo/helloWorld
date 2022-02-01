package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Db {

    public Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tests", "root", "laptop12345");
        return conn;
    }

    public void insertCours(Course course) throws SQLException {
        Connection connection = connect();

        Statement st = connection.createStatement();
        String query = "insert into courses values(null,'" + course.title + "','" + course.description + "')";

        st.execute(query);
        connection.close();
        st.close();
    }


    public void deleteCours(int id) throws SQLException {
        Connection connection = connect();

        Statement st = connection.createStatement();
        String query = "delete from courses where id = " + id;
        st.execute(query);
        connection.close();
        st.close();
    }


    public void updateCours(Course course) throws SQLException {
        Connection connection = connect();

        String query = "update courses set title = ?, description = ? where id = ?";

        PreparedStatement pst = connection.prepareStatement(query);

        pst.setString(1, course.title);
        pst.setString(2,course.description);
        pst.setInt(3,course.id);
        pst.execute();
        pst.close();


        connection.close();
    }

    public List getAllCourses() throws SQLException {
        List list = new ArrayList();
        Connection connection = connect();
        Statement st = connection.createStatement();
        String query = "SELECT * from courses";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()){
            Course course = new Course();
            course.id = rs.getInt("id");
            course.title = rs.getString("title");
            course.description = rs.getString("description");
            list.add(course);
        }

        connection.close();
        st.close();
        return list;

    }
    public Course getCourse(int id) throws SQLException {
        Connection connection = connect();
        Course course = null;

        String query = "select * from courses where id = ?";
        PreparedStatement pst = connection.prepareStatement(query);
        pst.setInt(1,id);
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            course = new Course();
            course.id = rs.getInt("id");
            course.title = rs.getString("title");
            course.description = rs.getString("description");

        }


        pst.close();
        connection.close();

        return course;
    }

}
