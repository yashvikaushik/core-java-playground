package jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class LibrarayCRUDOperationsPreparedStatement {
    public static void main(String[] args) {
         System.out.println("hello JDBC");
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            }
        catch(Exception e){
            System.out.println(e);
        }
        String url="jdbc:mysql://localhost:3306/library";
        String user="root2";
        String password="";

        try(Connection conn=DriverManager.getConnection(url,user,password)){
            System.out.println("connection established");

             String template="INSERT INTO publishers(publisher_id,name) VALUES (?,?);";
            /*try(PreparedStatement psmt=conn.prepareStatement(template)){
                psmt.setInt(1, 5);
                psmt.setString(2, "universal");
                int rowUpdated=psmt.executeUpdate();
                System.out.println("number of rows updated:  "+rowUpdated);
                 
                String statementquery="SELECT p.publisher_id , p.name as publisher_name , b.book_id , b.title as book_title  FROM publishers p , book b WHERE p.publisher_id=b.book_id;";
                System.out.println("now displaying the table");
                ResultSet rs=psmt.executeQuery(statementquery);
                System.out.println("the table created in the databse is: ");
                while(rs.next()){
                    int id=rs.getInt("publisher_id");
                    String name=rs.getString("publisher_name");
                    String title=rs.getString("book_title");
                    int id2=rs.getInt("book_id");
                    System.out.println("publisher_id : "+id+" publisher: "+name+" book_id: "+id2+" book_title: "+title);


                }
            }*/
            String template2="DELETE FROM publisher WHERE publisher_id=?;";

            /*try(PreparedStatement psmt=conn.prepareStatement(template2)){
                psmt.setInt(1,5);
                System.out.println("deletion successfull");
                String statementquery="SELECT p.publisher_id , p.name as publisher_name , b.book_id , b.title as book_title  FROM publishers p , book b WHERE p.publisher_id=b.book_id;";
                System.out.println("now displaying the table");
                ResultSet rs=psmt.executeQuery(statementquery);
                System.out.println("the table created in the databse is: ");
                while(rs.next()){
                    int id=rs.getInt("publisher_id");
                    String name=rs.getString("publisher_name");
                    String title=rs.getString("book_title");
                    int id2=rs.getInt("book_id");
                    System.out.println("publisher_id : "+id+" publisher: "+name+" book_id: "+id2+" book_title: "+title);


                }
            }*/

            String template3="UPDATE book set title=? WHERE id=?;";
            try(PreparedStatement psmt=conn.prepareStatement(template3)){
                psmt.setString(1, "this is us");
                psmt.setInt(2,1);
                System.out.println("updation successfull");
                int rowsupdate=psmt.executeUpdate();
                System.out.println("number of rows updated: "+rowsupdate);
                String statementquery="SELECT p.publisher_id , p.name as publisher_name , b.book_id , b.title as book_title  FROM publishers p , book b WHERE p.publisher_id=b.book_id;";
                System.out.println("now displaying the table");
                ResultSet rs=psmt.executeQuery(statementquery);
                System.out.println("the table created in the databse is: ");
                while(rs.next()){
                    int id=rs.getInt("publisher_id");
                    String name=rs.getString("publisher_name");
                    String title=rs.getString("book_title");
                    int id2=rs.getInt("book_id");
                    System.out.println("publisher_id : "+id+" publisher: "+name+" book_id: "+id2+" book_title: "+title);


            }
        }



        }
        catch(SQLException se){
            System.out.println(se);
        }
    }
}
    

