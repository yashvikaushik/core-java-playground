package jdbc;
//importing necessary classes 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryCRUDOperations {
    public static void main(String[] args) {
        //loading the driver manager jdbc
        System.out.println("hello JDBC");
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            }
        catch(Exception e){
            System.out.println(e);
        }

        //setting up the connection
        String url="jdbc:mysql://localhost:3306/library";
        String user="root2";
        String password="";

        try(Connection conn=DriverManager.getConnection(url, user, password)){
          System.out.println("wuhu you are now connected to the database");

          System.out.println("prepairing the statement");
           try(Statement stmt=conn.createStatement() ){
            String query="SELECT p.publisher_id , p.name as publisher_name , b.book_id , b.title as book_title  FROM publishers p , book b WHERE p.publisher_id=b.book_id;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("publisher_id");
                String name=rs.getString("publisher_name");
                int bid=rs.getInt("book_id");
                String bname=rs.getString("book_title");
                System.out.println("publisher_id : "+id+" publisher: "+name+" book+id: "+bid+" book_title: "+bname);
            }
          }
         
          //inserting a new row
          try(Statement stmt=conn.createStatement()){
            System.out.println("inserting a new row");
            String inserStmt="INSERT INTO publishers(publisher_id,name) VALUES (5,'universal');";
            int rowsIserted=stmt.executeUpdate(inserStmt);
            System.out.println("the number of rows updated are: "+rowsIserted);
            String query="SELECT p.publisher_id , p.name as publisher_name , b.book_id , b.title as book_title  FROM publishers p , book b WHERE p.publisher_id=b.book_id;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("publisher_id");
                String name=rs.getString("publisher_name");
                int bid=rs.getInt("book_id");
                String bname=rs.getString("book_title");
                System.out.println("publisher_id : "+id+" publisher: "+name+" book_id: "+bid+" book_title: "+bname);
            }

          }

          //updating the entries of a column
           try(Statement stmt=conn.createStatement()){
            String updateStmt="UPDATE book SET title='novel' WHERE id=1";
            int rowsUpdated=stmt.executeUpdate(updateStmt);
            System.out.println("the number of rows updated are: "+rowsUpdated);
            String query="SELECT p.publisher_id , p.name as publisher_name , b.book_id , b.title as book_title  FROM publishers p , book b WHERE p.publisher_id=b.book_id;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("publisher_id");
                String name=rs.getString("publisher_name");
                int bid=rs.getInt("book_id");
                String bname=rs.getString("book_title");
                System.out.println("publisher_id : "+id+" publisher: "+name+" book_id: "+bid+" book_title: "+bname);
            }
                }

          //deleting a already existing statement 
            try(Statement stmt=conn.createStatement()){
            String updateStmt="DELETE FROM publishers WHERE publisher_id=5";
            int rowsDeleted=stmt.executeUpdate(updateStmt);
            System.out.println("the number of rows updated are: "+rowsDeleted);
            String query="SELECT p.publisher_id , p.name as publisher_name , b.book_id , b.title as book_title  FROM publishers p , book b WHERE p.publisher_id=b.book_id;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("publisher_id");
                String name=rs.getString("publisher_name");
                int bid=rs.getInt("book_id");
                String bname=rs.getString("book_title");
                System.out.println("publisher_id : "+id+" publisher: "+name+" book_id: "+bid+" book_title: "+bname);
            }
                }

        }
        catch(SQLException se){
            System.out.println(se);
        }
    }
    
}
