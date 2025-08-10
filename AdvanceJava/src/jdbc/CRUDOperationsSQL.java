package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDOperationsSQL {
    public static void main(String[] args) {
        System.out.println("hello JDBC");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return; // exit if driver not found
        }
        String url="jdbc:mysql://localhost:3306/library";
        String user="root2";
        String password="";

        try(Connection conn=DriverManager.getConnection(url, user, password)){
          System.out.println("wuhu you are now connected to the database");


          /*  try(Statement stmt=conn.createStatement()){
                String upstmt="INSERT INTO students(id,name,email,course_id) VALUES (3,'ragahav','raghav@gmail',2)";
                int rowsUpdated = stmt.executeUpdate(upstmt);
    
                System.out.println("number of rows inserted: "+rowsUpdated);

                String selectstmt="SELECT * FROM students ;";
                ResultSet rs=stmt.executeQuery(selectstmt);
                while(rs.next()){
                    int id=rs.getInt("id");
                    String name=rs.getString("name");
                    System.out.println("student_id: "+id+"student_name: "+name);
                }
            }*/

           /*  try(Statement stmt=conn.createStatement()){
                String update="UPDATE students SET name='rohit' WHERE id=3;";
                int rowUpdated=stmt.executeUpdate(update);
                String selectStmt="SELECT * FROM students ;";
                ResultSet rs=stmt.executeQuery(selectStmt);
                while(rs.next()){
                    int id=rs.getInt("id");
                    String name=rs.getString("name");
                    System.out.println("student_id: "+id+"student_name: "+name);
                }

            }*/

           /*  try(Statement stmt=conn.createStatement()){
                String delete="DELETE FROM students WHERE id=3;";
                int rowDeleted=stmt.executeUpdate(delete);
                String selectStmt="SELECT * FROM students ;";
                ResultSet rs=stmt.executeQuery(selectStmt);
                while(rs.next()){
                    int id=rs.getInt("id");
                    String name=rs.getString("name");
                    System.out.println("student_id: "+id+"student_name: "+name);
                }

            }*/

            //using prepared statement
            String templateQuery="INSERT INTO students(id,name,email,course_id) VALUES (?,?,?,?)";
            try(PreparedStatement pStmt=conn.prepareStatement(templateQuery)){
               /*  pStmt.setInt(1,4);
                pStmt.setString(2,"anushka");
                pStmt.setString(3, "anushka@gmail");
                pStmt.setInt(4, 1);
                int rowsUpdated=pStmt.executeUpdate();
                System.out.println("rows updated are : "+rowsUpdated);*/
                  String selectStmt="SELECT * FROM students ;";
                ResultSet rs=pStmt.executeQuery(selectStmt);
                while(rs.next()){
                    int id=rs.getInt("id");
                    String name=rs.getString("name");
                    System.out.println("student_id: "+id+"student_name: "+name);
                }

                

            }




        }
        catch(SQLException e){
            System.out.println(e);

        }
    }
}
        

    

