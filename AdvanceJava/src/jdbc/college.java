package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class college {
    public static void main(String[] args) {
        System.out.println("hello JDBC");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return; // exit if driver not found
        }

        //cretaing connection

        String url="jdbc:mysql://localhost:3306/ college";
        String username="root2";
        String password="";

        try(Connection conn=DriverManager.getConnection(url, username, password)){
            System.out.println("connected to database successfully");
            try(Statement stmt=conn.createStatement()){
                String query="SELECT s.id, s.name, s.email, c.course_name\n" + //
                                        "FROM students s,courses c  \n" + //
                                        "WHERE s.course_id = c.id ;";
                ResultSet rst=stmt.executeQuery(query);

                while(rst.next()){
                    String course=rst.getString("course_name");
                    String name=rst.getString("name");
                    int id=rst.getInt("id");
                    System.out.println("student name| "+name+" student_id| "+id+" course| "+course);
                }

            }

        }
        catch(SQLException e){
            System.out.println(e);
        }

    }
    
}
