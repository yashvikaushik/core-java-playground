package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstDemo {
    public static void main(String[] args) {
        System.out.println("Hello, JDBC!");
        // load the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return; // exit if driver not found
        }

        // create connection
        String url = "jdbc:mysql://localhost:3306/ BankManagement"; // replace with your database URL
        String user = "root2"; // replace with your database username
        String password = ""; // replace with your database password
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database successfully!");
            // create statement
            try (Statement stmt = conn.createStatement()) {
                System.out.println("Created statement...");
                // execute SQL statement
                String sql = "SELECT c.id,c.name,a.street,a.state,b.place,ba.id as bank_id , ba.name as bank_name FROM address a,customer c,branch b,banking ba WHERE a.id=1 AND a.customer_id=c.id AND c.branch_id=b.id AND b.banking_id=ba.id;\n" + //
                                        ""; // replace with your SQL query
                System.out.println("Executing query...");
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("Query executed successfully!");
                // process the result set
                while (rs.next()) {
                    int id = rs.getInt("id"); // replace with your column name
                    String name = rs.getString("name"); // replace with your column name
                    String street = rs.getString("street"); // replace with your column name
                    String state = rs.getString("state");
                     int bid = rs.getInt("bank_id");
                      String bankname = rs.getString("bank_name");
                       String place = rs.getString("state"); // replace with your column name
                    System.out.println("ID: " + id + " name: " + name + ", Street: " + street + " state: " + state+" bankid"+bid+" ");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Here you can add code to connect to a database and perform operations
    }
}
    

