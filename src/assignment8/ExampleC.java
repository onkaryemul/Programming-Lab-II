/*
   c) Update city from Sangli to Pune.
*/

package assignment8;

import java.sql.*;

public class ExampleC {

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

            // Update city
            System.out.println("\nUpdating city from Sangli to Pune...");
            stmt = conn.createStatement();

            String query = "UPDATE Student SET City='Pune' WHERE city='Sangli'";
            int rows = stmt.executeUpdate(query);

            System.out.println(rows + " rows updated successfully...");

            // Close resources
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


