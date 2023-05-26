/*
   e) Display students according to their marks (Descending order).
*/

package assignment8;

import java.sql.*;

public class ExampleE {

    // JDBC driver name and database URL
    public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

    // Database credentials
    public static final String USER = "system";
    public static final String PASSWORD = "admin";

    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;

        try
        {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("\nConnecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);

            // Display students according to their marks
            System.out.println("\nStudents according to their marks (Descending order):");
            stmt = conn.createStatement();

            String query = "SELECT * FROM Student ORDER BY Marks DESC";

            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                int rollNo = rs.getInt("Roll_No");
                String name = rs.getString("Name");
                String city = rs.getString("City");
                String grade = rs.getString("Grade");
                double marks = rs.getDouble("Marks");

                System.out.println(rollNo + "\t" + name + "\t" + city + "\t" + grade +
                                  "\t" + marks);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(SQLException se)
        {
            // Handle errors for JDBC
            se.printStackTrace();
        }
        catch(Exception e)
        {
            // Handle errors for Class.forName
            e.printStackTrace();
        }
        finally
        {
            // Close resources
            try
            {
                if(stmt!=null)
                {
                    stmt.close();
                }
            }
            catch(SQLException se2)
            {
                se2.printStackTrace();
            }

            try
            {
                if(conn!=null)
                {
                    conn.close();
                }
            }
            catch(SQLException se3)
            {
                se3.printStackTrace();
            }
        }
    }

}

